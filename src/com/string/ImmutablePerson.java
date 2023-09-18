package com.string;

 final class Immu {

	private final String name;
	private final int age;

	public Immu(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void m1() {
		System.out.println(getName()+" "+getAge());
	}
}

public class ImmutablePerson  {
	public static void main(String[] args) {
		Immu ip = new Immu("AbuBakar", 20);
		Immu ip1 = new Immu("Xyz", 21);
		ip.m1();
		ip1.m1();
	}
}