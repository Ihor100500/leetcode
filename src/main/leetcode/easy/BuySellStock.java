package main.leetcode.easy;

import java.util.Arrays;
import java.util.List;

public class BuySellStock {

  public static void main(String[] args) {
    BuySellStock buySellStock = new BuySellStock();
    int[] prices = {7, 6, 4, 3,1 };
    System.out.println(buySellStock.maxProfit(prices));
  }

  //  public int maxProfit(int[] prices) {
  //    int maxProfit = 0;
  //    int currentProfit;
  //    for (int i = 0; i < prices.length - 1; i++) {
  //      for (int j = i + 1; j < prices.length; j++) {
  //        if (j - i > 0) {
  //          currentProfit = prices[j] - prices[i];
  //          maxProfit = Math.max(currentProfit, maxProfit);
  //        }
  //      }
  //    }
  //    return maxProfit;
  //  }

  public int maxProfit(int[] prices) {
    int profit;
    int maxProfit = 0;
    for (int left = 0; left < prices.length - 1; left++) {
      int right = left + 1;
      while (right < prices.length && prices[right] > prices[left]) {
        profit = prices[right] - prices[left];
        maxProfit = Math.max(profit, maxProfit);
        right++;
      }
    }
    return maxProfit;
  }
}
