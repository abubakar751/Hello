package com.array;

public class ArrayClone {

	public static void main(String[] args) {
		int arr[] = { 33, 4, 5, 5, 6 };

		System.out.println("  printing org Array");
		for (int i : arr) {
			System.out.println(i);
		}
		int var[] = arr.clone();
		System.out.println(" printing clone array");
		for (int i1 : var) {
			
			System.out.println(i1);
			
		}
		System.out.println(arr == var);

	}

}
