package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ReplaceByRank {

	public static void main(String[] args) {
		int[] nums = {20,15,26,2,98,6};
		int n = nums.length;
		replaceByRank(nums,n);
		System.out.println();
		replaceWithRankUsingMap(nums,n);
	}
 
	private static void replaceWithRankUsingMap(int[] nums, int n) {
		
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		
		int temp =1;
		int dup[] = new int[n];
		for (int i = 0; i < n; i++) {
			dup[i] = nums[i];
		}
		
		Arrays.sort(dup); //dup array is the sorted array
		for (int i = 0; i < dup.length; i++) {
			//the rank of the elements is given here and put in a map
			if(mp.get(dup[i]) == null) {
				mp.put(dup[i], temp);
				temp++;
			}
		}
		
		
		//we get the value which is the value of the corresponding element in the map in unsorted array
		for (int i = 0; i < dup.length; i++) {
			System.out.print(mp.get(nums[i])+" ");
		}
	}

	private static void replaceByRank(int[] nums, int n) {
		
		
		
		for (int i = 0; i < n; i++) {
			HashSet<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < n; j++) {
				if(nums[i]>nums[j]) {
					set.add(nums[j]);
				}
			}
			int rank = set.size()+1;
			System.out.print(rank+" ");
		}
		
	}

}
