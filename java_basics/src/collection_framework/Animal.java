package collection_framework;

import java.util.Objects;

public class Animal {
	String name;
	int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	

}
