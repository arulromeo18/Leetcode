class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=Integer.MIN_VALUE;;
        int min=prices[0];
        for(int n:prices){
            min=Math.min(min,n);
            maxprofit=Math.max(maxprofit,n-min);
        }
        return maxprofit;
    }
}
