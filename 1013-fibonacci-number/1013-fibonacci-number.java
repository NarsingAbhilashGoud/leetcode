class Solution {
    int[] mem = new int[31];
    public int fib(int n) {
        if(n<=1) return n;
        if(mem[n] != 0) return mem[n];
        mem[n] = fib(n-1) + fib(n-2);
        
        return mem[n];
         }
}