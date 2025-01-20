package com.tnsif.inheritance;

class Person {
	 String name;
	    int age;

	    // Constructor for Person
	    public Person(String name, int age) throws Exception {
	        if (age <= 0) {
	            throw new Exception("Age must be positive.");
	        }
	        this.name = name;
	        this.age = age;
	    }

	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
  }
}