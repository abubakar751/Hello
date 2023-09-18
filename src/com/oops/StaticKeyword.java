package com.oops;
class Emp{
	String name;
	int age ;
	 static String com="Sak";
	 Emp(String n,int a){
		 name=n;
		 age=a;
	 }
	 void m1() {
		 System.out.println(name+" \t"+age+" \t"+com);
		 
	 }
}
public class StaticKeyword {
public static void main(String[] args) {
	Emp e=new Emp("AbuBakar", 20);
	Emp e1=new Emp("Tanveer",21);
	e.m1();
	e1.m1();
}
}
