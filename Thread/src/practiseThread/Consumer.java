package practiseThread;
import java.util.*;
public class Consumer implements Runnable  {
	List<Integer> questionList=null;
	final int Limit=5;
	private int questionNo;
	
	public Consumer(List<Integer> questionList) {
		this.questionList=questionList;
	}

	public void answerQuestion() throws InterruptedException {
		synchronized(questionList) {
			while(questionList.isEmpty()) {
				System.out.println("No more question to answer");
				questionList.wait();
			}
		}
		
		synchronized(questionList) {
			Thread.sleep(5000);
			System.out.println("Answered Questions "+questionList.remove(0));
			questionList.notify();
		}
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				answerQuestion();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
