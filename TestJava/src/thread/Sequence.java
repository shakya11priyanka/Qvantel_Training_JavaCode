package thread;

public class Sequence {
 
	private int val=0;
	public int getNext() {
		
		synchronized(this) {
			val++;
			return val;
		}
		
		
		
	}
	 
}
