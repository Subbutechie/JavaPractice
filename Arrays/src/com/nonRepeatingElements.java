package com;

import java.util.HashMap;
import java.util.Map;

public class nonRepeatingElements {
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,3,5,3,1};
		int n = arr.length;
		findNonRepeatingElements(arr,n);
		System.out.println();
		findNonRepeatingElementsUsingMaps(arr,n);
	}

	private static void findNonRepeatingElementsUsingMaps(int[] arr, int n) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < n; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
				map.put(arr[i], 1);
		}
		
		for(Map.Entry<Integer, Integer> mp:map.entrySet()) {
			if(mp.getValue()==1) {
				System.out.println(mp.getKey());
			}
			
		}
	}

	private static void findNonRepeatingElements(int[] arr, int n) {
		
		
		boolean flag;
		for (int i = 0; i <n; i++) {
			flag=false;
			for (int j = 0; j < n; j++) {
				
				if(i!=j && arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(arr[i]);
			}
		}
	}

}
