package com.tnsif.dayfive.association.hasa;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Address address = new Address("405 Laxmi Enclave, Pandit Colony", "Nashik", "Maharashtra", "422003");
			Person person = new Person("Aniket Pawar", address);
			person.displayInfo();
	}

}
