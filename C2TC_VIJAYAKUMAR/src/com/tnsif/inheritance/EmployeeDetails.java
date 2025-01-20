package com.tnsif.inheritance;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            // Create an Employee object with valid details
	            Employee emp1 = new Employee("Alice", 30, "E001", "IT", 75000.00);
	            System.out.println("Employee Details:");
	            emp1.displayDetails();

	            // Attempt to create an Employee with invalid age
	            System.out.println("\nTrying to create an employee with invalid age...");
	            Employee emp2 = new Employee("Bob", -25, "E002", "HR", 60000.00);
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        try {
	            // Attempt to create an Employee with invalid salary
	            System.out.println("\nTrying to create an employee with invalid salary...");
	            Employee emp3 = new Employee("Charlie", 28, "E003", "Finance", -50000.00);
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}
}