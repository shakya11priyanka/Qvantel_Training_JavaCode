package practiseThread;
import java.util.*;
public class Producer implements Runnable  {
	List<Integer> questionList=null;
	final int Limit=5;
	private int questionNo;
	
	public Producer(List<Integer> questionList) {
		this.questionList=questionList;
	}

	public void read(int questionNo) throws InterruptedException {
		synchronized(questionList) {
			while(questionList.size()==Limit) {
				System.out.println("No more question to answer");
				questionList.wait();
			}
		}
		
		synchronized(questionList) {
			System.out.println("New Questions "+questionNo);
			questionList.add(questionNo);
			Thread.sleep(1000);
			questionList.notify();
		}
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				read(questionNo++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
