package com.oops;
class NonMAin{
	void m1() {
		System.out.println(" M1 methhod ");
	}
	void m2() {
		System.out.println(" M2 mmethod ");
		
	
	this.m1();
	}
}
public class ThisKeyWord {

	public static void main(String[] args) {
		NonMAin n=new NonMAin();
		n.m2();
	}

}
