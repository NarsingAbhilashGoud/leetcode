class Solution {
    public boolean isPowerOfThree(int n) {
        // The largest power of 3 that fits into an integer
        int maxPowerOfThree = 1162261467;
        
        // If n is greater than 0 and divides the largest power of three, it is a power of three
        return n > 0 && maxPowerOfThree % n == 0;
    }
}