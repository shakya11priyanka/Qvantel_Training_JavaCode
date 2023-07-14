package collection_framework;
import java.util.*;

public class Traversing_List {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Hello");
		list.add("I");
		list.add("Am Priyanka Shakyawar");
		
		System.out.println(list);
		
		ArrayList<Vehicle> vehicle=new ArrayList<Vehicle>();
        vehicle.add(new Vehicle("honda","accord",12000,false));
        
        Vehicle vehicle2=new Vehicle("shyam","suzuki",3400,true);
		
		System.out.println(vehicle);
		System.out.println(vehicle2);
		vehicle.add(vehicle2);
		
		for(Vehicle car: vehicle) {
			System.out.println(car.toString());
		   
		}
		
		
		
		
	}

}
