package com;

public class StockBuyOrSellSingleTrans {
	public static void main(String[] args) {
		int[] prices = {7, 6, 4, 3, 1};
		System.out.println(maximumProfit(prices));
	}

	private static int maximumProfit(int[] prices) {
		
		
		int maxProfit = 0;
		int minSoFar = prices[0];
		
		for(int i = 1; i<prices.length; i++) {
			
			minSoFar = Math.min(minSoFar, prices[i]);
			
			maxProfit = Math.max(maxProfit, prices[i]-minSoFar);
		}
		return maxProfit;
	}
}
