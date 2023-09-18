package com.oops;
class Sttudent{  
int rollno;  
String name,course;  
float fee;  
Sttudent(int rollno,String name,String course){  
this.rollno=rollno;  
this.name=name;  
this.course=course;  
}  
Sttudent(int rollno,String name,String course,float fee){  
this(rollno,name,course);//reusing constructor  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
}  
class UseThisCons{  
public static void main(String args[]){  
Sttudent s1=new Sttudent(111,"ankit","java");  
Sttudent s2=new Sttudent(112,"sumit","java",6000f);  
s1.display();  
s2.display();  
}}  
