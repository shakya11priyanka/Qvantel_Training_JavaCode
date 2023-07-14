package collection_framework;
import java.util.*;

public class ArrayList_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList word=new ArrayList();
		 word.add("Hello");
		 word.add("I am Priyanka ");
		 word.add("Shakyawar");
		
		System.out.println(word);
		String list=(String) word.get(1);
		
		word.remove(0);
		System.out.println(word);
		System.out.println(list);
		
	}

}
