package Remaking_Example;

public class Pet {
	//vars for pet
	private String name = "";
	private int age = 0;
	//constructor
	public Pet(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	//getters + setters
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
	//to string thing
	public String toString() {
		return
				"Name: " + name + "\n"
				+ "Age: " + age;
	}
	
}
