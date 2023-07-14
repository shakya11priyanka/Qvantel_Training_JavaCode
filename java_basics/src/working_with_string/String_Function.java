package working_with_string;

public class String_Function {

	public static void main(String[] args) {
		 String a="Hello";
		 String b="World";
		 String c="Hi I am Priyanka Shakyawar";
		 
		 if(a=="Hello") {
			 System.out.println("Hello Printed");
		 }
		 else if(a.equals(b)) {
			 System.out.println("Strings are not equal");
		 }
		 else {
			 System.out.println("String function applied");
		 }
		 
		 System.out.println(a.charAt(4));
		 
		 System.out.println(c.indexOf("Priyanka"));
		
	}
	
}
