package arrays.medium;

public class StocksSellBuy {
    public int maxProfit(int[] prices) {
        int maxProfit = 0 ;
        int minPrice = Integer.MAX_VALUE ; int profit = Integer.MIN_VALUE;

        for(int i = 0 ; i < prices.length ; i++){
            minPrice = Math.min(minPrice, prices[i]) ;
            profit = prices[i] - minPrice ;
            maxProfit = Math.max(maxProfit, profit) ;
        }
        return maxProfit ;
    }
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4} ;

        StocksSellBuy sellBuy = new StocksSellBuy() ;
        int ans = sellBuy.maxProfit(nums) ;

        System.out.println(ans);
    }
}
