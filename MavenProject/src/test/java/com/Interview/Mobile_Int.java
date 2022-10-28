package com.Interview;

public class Mobile_Int {

	public static void main(String[] args) {

		int[] arr = new int[] { 21, 54, 11, 35, 4, 18 };
		
		int n = 2;

		System.out.println("Original Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < n; i++) {

			int j, last;
			last = arr[arr.length - 1];

			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}

			arr[0] = last;
		}
		System.out.println();

		System.out.println("Array after rotation");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}