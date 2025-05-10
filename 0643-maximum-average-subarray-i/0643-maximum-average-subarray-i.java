class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=0,sum=0;
        double maxSum = Integer.MIN_VALUE;
        while(j < nums.length){
                sum += nums[j];
                if(j-i+1 <k) j++;
                else if(j-i+1 == k){
                    maxSum = Math.max(maxSum, sum);
                    sum = sum- nums[i];
                    i++;j++;
                }
        }    double avg = maxSum/k;
        return avg;
    }
}