package practiseThread;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> questionList=new ArrayList<Integer>();

		Thread t1=new Thread(new Producer(questionList));
		Thread t2=new Thread(new Consumer(questionList));
		
		t1.start();
		t2.start();
	}

}
