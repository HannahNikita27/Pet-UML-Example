package Remaking_Example;

import java.util.Arrays;

public class Owner {
	//vars for owner
	private Pet pets[] = new Pet[4];
	private int count = 0;
	private String name = "";
	
	//constructor
	public Owner(String name) {
		this.name = name;
	}
	
	//allow owners to add pets to their collection
	public void addPet(Pet x) {
		if(count < 4) {
			pets[count] = x;
			updateCount();
			System.out.println(x.toString() + "\n" + " was added to " + name);
		}
		else {
			System.out.println("Pet no added :(");
		}
	}
	
	//make sure the owner has enough space for more pets in their collection
	protected void updateCount() {
		count++;
	}
	
	//show all the owner data
	public String toString() {
		return 
				name + "\n" + "Pets: " 
				+ Arrays.toString(pets);
	}
}
