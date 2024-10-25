package leetcode;

public class BestTimeToBuyAndSellStock_121 {

	public static int maxProfit(int[] prices) {

		int min_price = Integer.MAX_VALUE;
		int max_profit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (min_price > prices[i]) {
				min_price = prices[i];
			} else if (prices[i] - min_price > max_profit) {
				max_profit = prices[i] - min_price;
			}
		}

		return max_profit;
	}
	
	public static void main(String[] args) {
		
		int[] prices = {7,1,5,3,6,4};
		
		int max_profit = BestTimeToBuyAndSellStock_121.maxProfit(prices);
		
		System.out.println(max_profit);
		
		int[] prices1 = {7,6,4,3,1};
		
		 max_profit = BestTimeToBuyAndSellStock_121.maxProfit(prices1);
		 
		 System.out.println(max_profit);
	}

}
