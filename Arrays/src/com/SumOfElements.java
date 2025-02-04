package com;

import java.util.stream.IntStream;

public class SumOfElements {
	
	public static void main(String[] args) {
		int arr[] = {1,3,4,5,6};
		int  n = arr.length;
		ArraySum(arr,n);
		ArraySumUsingStreams(arr);
	}

	private static void ArraySumUsingStreams(int[] arr) {
		System.out.println("Using streams:");
		long sum = IntStream.of(arr).sum();
		System.out.println(sum);
		
	}

	private static void ArraySum(int[] arr, int n) {
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		System.out.println("sum of elments is "+sum);
	}

}
