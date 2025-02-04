package com;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FreqOfElementsInArray {
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,2,4,3};
		int n = arr.length;
		freqCount(arr, n);//Using two for Loops
		freqCountUsingMap(arr,n);
		
	}
	
	public static void freqCountUsingMap(int[] arr, int n) {
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i =0; i<n; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		System.out.println("Printing using foreach method:");
		map.forEach((key,value) -> System.out.println(key+" - "+value));
		
		System.out.println("Printing using entryset and for each loop:");
		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
		System.out.println("Printing using streams:");
		String result = map.entrySet().stream()
					.map(entry -> entry.getKey()+" - "+entry.getValue())
					.collect(Collectors.joining(","));
		System.out.println(result);
	}

	//TC: O(N*N)
	//SC: O(N)
	public static void freqCount(int[] arr, int n) {
		
		boolean visited[] = new boolean[n];
		
		for(int i=0; i<n; i++) {
			if(visited[i] == true) {
				continue;
			}
			int count=1;
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i]+ " - " +count);
		}
	}
	
	
	
	

}
