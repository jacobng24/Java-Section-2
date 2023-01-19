//HCS_2_1
public class Student {
	private String first;
	private String last;
	private int age;
	private int id;
	
	public Student()
	{
		first = "John";
		last = "Doe";
		age = 1;
		id = (int)(Math.random()*100 + 100);
	}
	
	public Student(String f)  
	{
		first = f;
		last = "Doe";
		age = 1;
		id = (int)(Math.random()*100 + 100);
	}
	
	public Student(String f, String l)
	{
		first = f;
		last = l;;
		age = 1;
		id = (int)(Math.random()*100 + 100);
	}
	
	public Student(String f, String l, int a)
	{
		first = f;
		last = l;
		age = a;
		id = (int)(Math.random()*100 + 100);
	}
	
	public Student(String f, String l, int a, int i)
	{
		first = f;
		last = l;
		age = a;
		id = i;
	}
	
	public void Getage(int GetAgev)
	{
		GetAgev = age;
	}
	
	public void SetID (int setIDv)
	{
		id = setIDv;
	}
	
	public void SetAge(int SetAgev)
	{
		age = SetAgev;
	}
	
	public String toString()
	{
		String str ="\nStudent: "+last+", "+first;
		str = str+"\nAge:\t" +age+"\nID:\t"+id+"\n";
		return str;
		
	}
//complete the Student class below use the Car class from the discussion as a reference
	/*
	 * Each Student Should have a first name, last name, age and id
	 * Make it so a student can be created, have a constructor, with just a first name a last name passed as parameters
	 * 		in this case the age will be set to a default value of 1, and the id will be set to a random
	 * 		value between 100 and 199, this code will produce that   (int)(Math.random()*100 + 100)
	 * 
	 * Make another constructor that will allow for the first name, last name and age are passed as parameters
	 * 		the id will be set to a random value between 100 and 199, 
	 * 		this code will produce that   (int)(Math.random()*100 + 100)
	 * 
	 * Make a final constructor that allows for all variables, first name, last name, age and id to be passed in 
	 * 		as parameters
	 */
	
	
	
	/*
	 * create a method called getAge that will return the calling Student object's age
	 */
	
	
	
	/*
	 * create a method called setAge that will accept an int parameter then set the calling Student object's
	 * 		age to that value
	 */
	
	
	/*
	 * create a method called getID that will return the calling Student object's ID
	 */
	
	
	
	/*
	 * write a toString method to output all of the calling Student object's information in the below formatted
	 * 
	 * Student:	last name, first name    //last name and first name should actually be replaced with the objects data
	 * Age:		20
	 * ID:		175
	 */
}//Student