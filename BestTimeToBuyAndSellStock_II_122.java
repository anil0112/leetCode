package leetcode;

public class BestTimeToBuyAndSellStock_II_122 {

	public static int maxProfit(int[] prices) {

		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i - 1] < prices[i]) {
				profit += (prices[i]) - prices[i - 1];
			}
		}

		return profit;
	}

	public static void main(String[] args) {

		int prices[] = { 7, 1, 5, 3, 6, 4 };
		int maxProfit = BestTimeToBuyAndSellStock_II_122.maxProfit(prices);

		System.out.println(maxProfit);

		int prices2[] = { 1, 2, 3, 4, 5 };
		maxProfit = BestTimeToBuyAndSellStock_II_122.maxProfit(prices2);
		System.out.println(maxProfit);

		int prices3[] = { 7, 6, 4, 3, 1 };
		maxProfit = BestTimeToBuyAndSellStock_II_122.maxProfit(prices3);
		System.out.println(maxProfit);
	}

}
