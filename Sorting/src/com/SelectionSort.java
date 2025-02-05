package com;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr = {1,3,4,2,5};
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	//Selection sort for each iteration selects the largest element and swaps it with the element
	//at the end
	//The range of iteration will be decreased by one element 
	//since the last element is  already sorted.
	//check max and swap it happens for  N-1 times
	//Best and worst case time complexity is O(N*2)
	//works well on small datasets
	//Not a stable algorithm i.e order of elements is not preserved
	 static void selection(int[] arr) {
		int n = arr.length;
		for(int i =0; i<n; i++) {
			int lastIndex = n-i-1;
			int maxIndex = getmaxIndex(arr,0,lastIndex);
			
			swap(arr,maxIndex,lastIndex);
		}
	}

	 static void swap(int[] arr, int maxIndex, int lastIndex) {
		//swap the element at the maxIndex with the element at the lastIndex
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[lastIndex];
			arr[lastIndex] = temp;
		
	}

	 //Finding the maxIndex at which the largest element is present
	 static int getmaxIndex(int[] arr, int start, int endpos) {
		int maxIndex = start;
		for(int i = start+1; i<=endpos;i++) {
			if(arr[i]>arr[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

}
