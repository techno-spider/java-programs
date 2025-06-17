package popular;

public class StockMaxProfitBuySellDay {
    public static void main(String[] args) {

        int[] prices = {7, 5, 2, 6, 9, 1};

        maxProfit(prices);
    }

    public static void maxProfit(int[] prices) {

        int maxProfit = 0;
        int buyDay = 0, sellDay = 0;
        int buyPrice = 0, sellPrice = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                    buyDay = i + 1;
                    sellDay = j + 1;
                    buyPrice = prices[i];
                    sellPrice = prices[j];
                }
            }
        }

        if (maxProfit > 2) {
            System.out.printf("The maximum profit is %d, achieved by buying at %d (Day %d) and selling at %d (Day %d)"
                              + ".%n", maxProfit, buyPrice, buyDay, sellPrice, sellDay);
        } else {
            System.out.println("No profit can be made.");
        }
    }
}


/*
 * The maximum profit is 7, achieved by buying at 2 (Day 3) and selling at 9 (Day 5).
 * */