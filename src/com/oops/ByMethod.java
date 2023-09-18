package com.oops;
class Student1{
	int id;
	String name;
	void insertData(int i,String n) {
		
		id=i;
		name=n;
		
	}
	void printData() {
		System.out.println(id+" "+name);
	}
}
public class ByMethod {

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.insertData(101,"Abu Bakar");
		
		s.printData();
	}

}
