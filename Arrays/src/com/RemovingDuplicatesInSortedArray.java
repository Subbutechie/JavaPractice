package com;

import java.util.HashSet;

public class RemovingDuplicatesInSortedArray {
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,4,5};
		int n = arr.length;
		int k= removeDuplicatesUsing2pointers(arr,n);
		for (int i = 0; i < k; i++) {
			System.out.println(arr[i]+" ");
			
		}
		int setSize = removeDuplicatesUsingHashSet(arr, n);
		for (int i = 0; i < setSize; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

	private static int removeDuplicatesUsing2pointers(int[] arr, int n) {
		
		int i=0;
		for (int j = 1; j < n; j++) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		return i+1;
		
		
	}

	private static int removeDuplicatesUsingHashSet(int[] arr, int n) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < n; i++) {
			set.add(arr[i]);
			
		}
		int setSize=set.size();
		int j =0;
		for(int x : set) {
			arr[j++] = x;
		}
		
		return setSize;
	}

}
