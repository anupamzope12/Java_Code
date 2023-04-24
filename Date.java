//1:Create Date class with members day,month ,year.
//Write no argument and parameterised constructor .Create two object s and initialize them using no argument and parameterised constructor
//respectively.Print date using display function.
//package Tester;

public class Date {
	
	int day;
	int month;
	int year;
	
	public Date()
	{
		
	}
	
	public Date(int day,int date,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public void display()
	{
		System.out.println("Day " + day + " Month " + month + " Year " + year );
	}
}
