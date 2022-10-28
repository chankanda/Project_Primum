package com.Interview;

import java.util.Arrays;

public class Interview_Test {

	public static int findProduct(int[] A, int n, int left, int i) {

		if (i == n) {
			return 1;
		}

		int curr = A[i];

		int right = findProduct(A, n, left * A[i], i + 1);

		A[i] = left * right;

		return curr * right;
	}

	public static void main(String[] args) {

		int[] A = { 7, 5, 6, 2, 4 };
		findProduct(A, A.length, 1, 0);

		System.out.println(Arrays.toString(A));
	}
}