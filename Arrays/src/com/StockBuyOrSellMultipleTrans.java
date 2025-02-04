package com;

public class StockBuyOrSellMultipleTrans {
	public static void main(String[] args) {
		int[] prices = {100, 180, 260, 310, 40, 535, 695};
		System.out.println(maximumProfit(prices));
	}
	
	 public static int maximumProfit(int prices[]) {
	       int n = prices.length;
	       int lmin = prices[0]; //Local minima
	       int lmax = prices[0]; //Local Maxima
	       int res = 0;
	       
	       int i =0;
	       while(i<n-1){
	           
	           //Find local minima
	           while(i<n-1 && prices[i] >= prices[i+1]){
	               i += 1;
	           }
	           lmin = prices[i];
	           
	           
	           //Find Local Maxima
	           while(i<n-1 && prices[i] <= prices[i+1]){
	               i += 1;
	           } 
	            lmax = prices[i];
	            
	            
	            //Add current profit
	            res += lmax - lmin;
	        
	       }
	       return res;
	       
	       
	    }

}
