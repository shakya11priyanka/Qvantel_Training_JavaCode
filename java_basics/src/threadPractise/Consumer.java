package threadPractise;

import java.util.List;

public class Consumer implements Runnable {
	
	List<Integer> questionList=null;
	
	
	Object myObject = new Object();
	
	public Consumer(List<Integer> questionList) {
		this.questionList = questionList;
	}
	
	public void ansQuestion() throws InterruptedException {
		synchronized(myObject) {
			while(questionList.isEmpty()) {
				 System.out.println("No of questions to Answer.. waiting for producer to get question");
			     try {
					questionList.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		synchronized(questionList) {
			Thread.sleep(5000);
			System.out.println("Answwer Question: "+questionList.remove(0));
			
			questionList.notify();
		}
		
	}
	
	
	public void run() {
		while(true) {
			try {
				ansQuestion();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}

