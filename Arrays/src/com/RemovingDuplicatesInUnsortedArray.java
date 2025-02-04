package com;

import java.util.HashMap;
import java.util.Map;

public class RemovingDuplicatesInUnsortedArray {
	
	
	public static void main(String[] args) {
		int[] arr = {2,4,7,8,3,1,2,8,4};
		int n = arr.length;
		removeDuplicatesUsingHashMap(arr);
		removeDuplicates(arr,n);
		
	}

	private static void removeDuplicatesUsingHashMap(int[] arr) {
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				System.out.println(arr[i]+" ");
				map.put(arr[i], 1);
			}
		}
	}

	private static void removeDuplicates(int[] arr, int n) {
		int mark[] = new int[n];
		for (int i = 0; i < mark.length; i++) {
			mark[i]=1;
		}
		
		for(int i=0; i<n;i++) {
			if(mark[i]==1) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]==arr[j]) {
						mark[i]=0;
					}
				}
			}
			
			if(mark[i]==1) {
				System.out.print(arr[i]+ ",");
			}
		}
	}

	

}
