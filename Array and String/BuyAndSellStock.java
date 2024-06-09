public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
      int maxProfit = 0;
      int minPrice = Integer.MAX_VALUE;
  
      for (int price : prices) {
        // Update minimum price so far
        minPrice = Math.min(minPrice, price);
        
        // Calculate profit for current price
        maxProfit = Math.max(maxProfit, price - minPrice);
      }
  
      return maxProfit;
    }
  }
  