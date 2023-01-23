package com.jsp.ObjectClass;

class Student
{
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

public class StudentDetails {

	public static void main(String[] args)
	{
	
		Student s1=new Student(1,"ganesh",22);
		System.out.println(s1);
		
		

	}

}
