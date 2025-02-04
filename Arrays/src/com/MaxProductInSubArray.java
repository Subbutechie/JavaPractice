package com;

public class MaxProductInSubArray {
	
	public static void main(String[] args) {
		int nums[] = {11,2,-3,0,-4,-5};
		int answer = maxProductSubArray(nums);
		System.out.print("The maximum product subarray is: "+answer);
		System.out.println();
		int result = maxProduct(nums);
		System.out.println("subarray's maxixmum product:"+result);
	}
	
	//TC:O(N)
	private static int maxProduct(int[] nums) {
		int result= Integer.MIN_VALUE;
		int prefix = 1,suffix = 1;
		
		for (int i = 0; i < nums.length; i++) {
			if(prefix == 0) prefix=1;
			if(suffix == 0) suffix=1;
			prefix *= nums[i];
			suffix *= nums[nums.length-i-1];
			
			result = Math.max(result, Math.max(prefix, suffix));
		}
		return result;
	}

	//TC: O(N*3)
	private static int maxProductSubArray(int[] nums) {
		
		int result = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				int product = 1;
				for (int k = i; k <= j; k++) {
					product *= nums[k];
				}
				result = Math.max(result, product);
			}
		}
		
		return result;
	}
	
	
	
	

}
