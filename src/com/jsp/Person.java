package com.jsp;


public class Person {

	String name;
	int age;
	double salary;
	
	public Person(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}



	public static void main(String[] args) {
		
		Person p1 = new Person("Neel Avinash",25, 56000);
		System.out.println(p1);
	}
	
}
