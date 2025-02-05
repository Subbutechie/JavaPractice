package com;

import java.util.Arrays;



public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {232,455,5,343,42};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
		//Arrays.stream(arr).forEach(System.out::println);
	}

	private static void bubble(int[] arr) {
		int n =arr.length;
		boolean swapped;//To keep checking if any iteration is missing
		for(int i = 0; i<n; i++) {
			 swapped = false;
			for(int j =1; j<n-i; j++)
			{
				//swap the adjacent elements
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
			
			if(!swapped) break;//If any pass is missed we break the outer loop which breaks the execution
		}
		
		
	}

}
