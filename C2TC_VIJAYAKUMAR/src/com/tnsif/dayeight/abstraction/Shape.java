package com.tnsif.dayeight.abstraction;

public abstract class Shape {
	 
    public float area;

	//abstract method 
	 abstract void calArea();
	 
	 //concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }
}
