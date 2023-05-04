package com.code;

import java.util.Objects;

public class Emp {
	
	private int empid;
	private String name;
	private double salary;
	
	public Emp(int empid, String name, double salary) 
	{
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
//		System.out.println(" In Empid ");
		return empid;
	}

	@Override
	public boolean equals(Object obj)
	{
		System.out.println("In equals");
		if(obj instanceof Emp)
			return this.empid==((Emp)obj).empid;
			return false;
	}
	

	
	
	
	

}
