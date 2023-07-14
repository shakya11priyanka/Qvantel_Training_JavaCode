package working_with_string;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="PriyakaShakuawar hi learn java PriyakaShakuawar hi learn java PriyakaShakuawar hi learn java";
		findIndex(n);

	}
	
	public static void findIndex(String name) {
		
		int i=0;
	    while(true) {
	    	int f= name.indexOf("learn",i);
	    	if(f==-1)
	    	{
	    		break;
	    	}
	         int s=f+5;
	         int e=name.indexOf(" ",s);
	         System.out.println(name.substring(s, e));
	         i=e+1;
	         
	    }
	}

}
