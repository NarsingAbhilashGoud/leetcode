class Solution {
    public int maxProfit(int[] prices) {
        int maxprof = 0;
        int min = Integer.MAX_VALUE;
        for(int price : prices){
            min = Math.min(price, min);
            maxprof = Math.max(price-min,maxprof);
        }return maxprof;
    }
}