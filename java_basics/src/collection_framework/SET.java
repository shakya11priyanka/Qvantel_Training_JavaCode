package collection_framework;
import java.util.*;

public class SET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
       
       HashSet<Animal> animals=new HashSet<Animal>();
       
       Animal animal2=new Animal("Dog",5);
       Animal animal1=new Animal("Lion",5);
       Animal animal3=new Animal("Cow",5);
       Animal animal4=new Animal("Sheep",5);
       Animal animal5=new Animal("Dog",5);
       Animal animal6=new Animal("Dog",5);
       

       
       animals.add(animal5);
       animals.add(animal1);
       animals.add(animal2);
       animals.add(animal3);
       animals.add(animal4);
       animals.add(animal6);
       
       
      for(Animal a:animals) {
    	  System.out.println(a);
      }
       
      System.out.println(animal5.equals(animal6));
       
       
       
       
	}

}
