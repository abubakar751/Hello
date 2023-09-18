package com.oops;
class Stu{
	void m1() {
		System.out.println(" hello ");
	}
}
class Stu1{
	void m1()throws ClassNotFoundException{
		System.out.println(" hiii");
	}
}
public class OverrideByEx {

	public static void main(String[] args) {
		
		Stu s=new  Stu();
		s.m1();

	}

}
