class Solution {
    public int maxProfit(int[] prices) {
        int dp[]= new int[prices.length];
        int minPrice = prices[0];
        dp[0]=0;
        for(int i=1;i<prices.length;i++){
            minPrice=Math.min(minPrice,prices[i]);
            dp[i]=Math.max(dp[i-1],prices[i]-minPrice);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<dp.length;i++){
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
