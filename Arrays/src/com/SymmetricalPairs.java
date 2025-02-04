package com;

import java.util.HashMap;

public class SymmetricalPairs {
	
	public static void main(String[] args) {
		int[][] arr = {{1,2},{2,1},{3,4},{4,3}};
		int n = arr.length;
		findSymmetricalPairs(arr,n);
		findSymmetricalPairsUsingHashmap(arr);
	}

	private static void findSymmetricalPairsUsingHashmap(int[][] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int first = arr[i][0];
			int second = arr[i][1];
			if(map.get(second)!=null && map.get(second) == first) {
				System.out.println("(" +first+","+second+")");
			}
			else
				map.put(first,second);
		}
			
	}

	private static void findSymmetricalPairs(int[][] arr, int n) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if((arr[i][0]==arr[j][1]) && (arr[j][0]==arr[i][1])) {
					System.out.println("(" +arr[i][1]+","+arr[i][0]+ ")");
					break;
				}
			}
			
		}
	}

}
