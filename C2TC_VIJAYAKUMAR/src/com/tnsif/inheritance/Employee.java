package com.tnsif.inheritance;

class Employee extends Person {
	 String employeeId;
	    String department;
	    double salary;

	    // Constructor for Employee
	    public Employee(String name, int age, String employeeId, String department, double salary) throws Exception {
	        super(name, age); // Call the constructor of Person (base class)
	        if (salary <= 0) {
	            throw new Exception("Salary must be positive.");
	        }
	        this.employeeId = employeeId;
	        this.department = department;
	        this.salary = salary;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails(); // Display details from the base class
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: " + salary);
	    }
}