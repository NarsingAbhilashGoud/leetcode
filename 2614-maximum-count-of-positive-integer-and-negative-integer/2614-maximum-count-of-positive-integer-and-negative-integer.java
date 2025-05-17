class Solution {
    public int maximumCount(int[] nums) {
         int c = 0, c1=0;
            for(int i : nums){
                if(i < 0) c++;
                if(i > 0) c1++;
            }
        if(c>c1) return c;
        else return c1;
    }
}