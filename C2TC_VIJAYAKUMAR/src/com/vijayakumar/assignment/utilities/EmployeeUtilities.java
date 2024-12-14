package com.vijayakumar.assignment.utilities;

import com.vijayakumar.assignment.employees.*;
public class EmployeeUtilities {

   public void printEmployeeDetails(Employee employee) {
       System.out.println("Name: " + employee.getName());
       System.out.println("Employee ID: " + employee.getEmployeeId());
       System.out.println("Salary: " + employee.getSalary());
       if (employee instanceof Manager) {
           System.out.println("Department: " + ((Manager) employee).getDepartment());
       } else if (employee instanceof Developer) {
           System.out.println("Programming Language: " + ((Developer) employee).getProgrammingLanguage());
       }
   }
}
