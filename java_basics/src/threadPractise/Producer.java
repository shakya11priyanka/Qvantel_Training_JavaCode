package threadPractise;
import java.util.*;

public class Producer implements Runnable {
	
	List<Integer> questionList=null;
	final  int LIMIT=5;
	private int questionNo;
	
	Object myObject = new Object();
	
	public Producer(List<Integer> questionList) {
		this.questionList = questionList;
	}
	
	public void readQuestion(int questionNo) throws InterruptedException {
		synchronized(myObject) {
			while(questionList.size()==LIMIT) {
				 System.out.println("Questions have been piled up.. wait for consumer");
			     try {
					questionList.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		synchronized(questionList) {
			System.out.println("New Question: "+questionNo);
			questionList.add(questionNo);
			Thread.sleep(100);
			questionList.notify();
		}
		
	}
	
	
	public void run() {
		while(true) {
			try {
				readQuestion(questionNo++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
