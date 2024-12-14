package com.yourname.assignment.employees;

public class Employee {
	private String name;
    private int employeeId;
    private double salary;

    /**
     * Gets the name of the employee.
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the employee.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the employee ID.
     * @return the employee ID
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the employee ID.
     * @param employeeId the ID to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Gets the salary of the employee.
     * @return the salary of the employee
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
