package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;

public class SecondLargestTC {
	public static void main(String[] args) {
		int secondLargest = findSecondLargestUsingSet(new int[] {10, 1, 12, 34, 35});
		System.out.println(secondLargest);
	}

	private static int findSecondLargestUsingSet(int[] arr) {
		
		Arrays.sort(arr);
		TreeSet<Integer>  ts = new TreeSet<Integer>();
		for(int i: arr) {
			ts.add(i);
		}
		
		if(ts.size()==1) {
			return -1;
		}
		
		Optional<Integer> i = ts.stream().skip(ts.size()-2).findFirst();
		return i.get();
	}

	private static int findSecondLargest(int[] arr) {
		
		int n = arr.length;
		
		Arrays.sort(arr);
		
		int sL = arr[n-2];
		
		int i=0;
		while(sL == arr[n]) {
			int index = n-2-(++i);
			if(index == 0) {
				sL = arr[0];
				break;
			}
			sL = arr[index]; 
		}
	
		return 0;
	}
}
