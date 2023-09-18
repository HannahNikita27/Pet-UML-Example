package Remaking_Example;

public class Club {

	public Club() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//tell user what's up
		System.out.println("Running Setup Please Wait..........");
		
		//make some pet objects for the owners
		Pet pet1 = new Pet("Sammy", 2);
		Pet pet2 = new Pet("Happy", 1);
		Pet pet3 = new Pet("Danny", 6);
		Pet pet4 = new Pet("Nacho", 12);
		Pet pet5 = new Pet("Taco", 5);
		Pet pet6 = new Pet("Latte", 9);
		Pet pet7 = new Pet("Cheddar", 1);
		Pet pet8 = new Pet("Shelby", 7);
		
		//make some owner objects
		Owner owner1 = new Owner("Hannah");
		Owner owner2 = new Owner("Hailey");
		
		//give the owners their pets
		owner1.addPet(pet1);
		owner1.addPet(pet2);
		owner1.addPet(pet3);
		owner1.addPet(pet4);
		owner2.addPet(pet5);
		owner2.addPet(pet6);
		owner2.addPet(pet7);
		owner2.addPet(pet8);
		
		//give some space
		System.out.println("");
		System.out.println("");
		
		//print owners list of pets
		System.out.println(owner1.toString());
		System.out.println(owner2.toString());

	}

}
