package com.tnsif.dayseven.overriding.covariant;

public class CovariantOverridingDemo {

	public static void main(String arg[]) 
			throws CloneNotSupportedException
	{
		// new student object created
		        Student student1 = new Student(1, "MCA", "Kapil");
		        student1.printData();

		        // Create a clone of student1
		        Student student2 = (Student) student1.clone();
		        if (student2 != null) {
		            student2.printData();
		        }
		    }
		

	
	}

