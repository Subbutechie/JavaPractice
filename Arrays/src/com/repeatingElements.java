package com;

import java.util.HashMap;
import java.util.Map;

public class repeatingElements{
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,4,3,5,3,1};
		int n = arr.length;
		findRepeatingElements(arr,n);
		repeatingElements(arr,n);
	}

	private static void findRepeatingElements(int[] arr, int n) {
		int count =0;
		int[] dup = new int[n];
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				
				if(arr[i]==arr[j]) {
					dup[count++] = arr[i];
				}
				
			}
		}
		System.out.println("The repeating elements are:");
		for (int j = 0; j < count; j++) {
			if(dup[j] != dup[j+1])
			System.out.println(dup[j]);
		}
		
	}
	
	static void repeatingElements(int[] arr, int n) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		System.out.println("The repeating elements are: ");
		for(Map.Entry<Integer,Integer> mp: map.entrySet()) {
			if(mp.getValue()>1) {
				System.out.println(mp.getKey());
			}
		}
	}


}
