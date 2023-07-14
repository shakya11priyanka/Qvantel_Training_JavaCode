package javabasic;

public class Animal {


	int age;
	String gender;
	int weight;
	
	public Animal(int age, String gender, int weight) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}
	
	public static void eat() {
		
		System.out.println("Animal may be carvivores and harnivores");
	}
	
	public static void sleep() {
		
		System.out.println("Animal sleep");
	}

	}
	
