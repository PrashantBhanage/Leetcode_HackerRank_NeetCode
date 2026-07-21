class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minprice = Integer.MAX_VALUE;
        int max_price = 0;

        for(int i = 0; i<prices.length; i++){
           // for(int j = i+1; j<prices.length; j++){
                //int profit = prices[j] - prices[i];

                if(prices[i] < minprice){
                    minprice = prices[i];
                }
                else if(prices[i] - minprice> maxProfit){
                    maxProfit = prices[i] - minprice;
                }
            } return maxProfit;
            }
           
        }
    
