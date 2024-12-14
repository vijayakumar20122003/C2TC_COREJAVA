package com.vijayakumar.assignment.main;

import com.vijayakumar.assignment.employees.*;
import com.vijayakumar.assignment.utilities.*;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Manager manager = new Manager();
	        manager.setName("Alice");
	        manager.setEmployeeId(101);
	        manager.setSalary(90000);
	        manager.setDepartment("HR");

	        // Create Developer instance
	        Developer developer = new Developer();
	        developer.setName("Bob");
	        developer.setEmployeeId(102);
	        developer.setSalary(80000);
	        developer.setProgrammingLanguage("Java");

	        // Use EmployeeUtilities to print details
	        EmployeeUtilities utilities = new EmployeeUtilities();
	        System.out.println("Manager Details:");
	        utilities.printEmployeeDetails(manager);
	        System.out.println("\nDeveloper Details:");
	        utilities.printEmployeeDetails(developer);
	}

}
