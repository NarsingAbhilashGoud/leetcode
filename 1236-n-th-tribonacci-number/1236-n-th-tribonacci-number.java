class Solution {
     int[] mem = new int[38];
    public int tribonacci(int n) {
 
         if(n==0) return 0;
         if(n ==2 || n==1) return 1;
        if(mem[n] != 0) return mem[n];
        mem[n] = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        
        return mem[n];
        
    }
}