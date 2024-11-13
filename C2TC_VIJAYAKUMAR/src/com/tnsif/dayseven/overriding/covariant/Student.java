package com.tnsif.dayseven.overriding.covariant;

class Student implements Cloneable {
	    private int id;
	    private String course;
	    private String name;

	    public Student(int id, String course, String name) {
	        this.id = id;
	        this.course = course;
	        this.name = name;
	    }

	    public void printData() {
	        System.out.println("ID: " + id + ", Course: " + course + ", Name: " + name);
	    }

	    @Override
	    public Object clone() {
	        try {
	            return super.clone();
	        } catch (CloneNotSupportedException e) {
	            return null; // This should never happen because we implement Cloneable
	        }
	    }		
	}