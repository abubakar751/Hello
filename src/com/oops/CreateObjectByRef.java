package com.oops;
class Student{
	int id;
	String name;
	int age ;
}
public class CreateObjectByRef {

	public static void main(String[] args) {
		Student student=new Student();
		student.id=101;
		student.name="Abu Bakar";
		student.age=20;
		System.out.println(student.id+" "+student.name+" "+student.age);
	}

}
