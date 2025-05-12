class Solution {
    public int[] plusOne(int[] digits) {
         int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry-over, return the result
            }
            digits[i] = 0; // Set current digit to 0 if it's 9
        }
        
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; 
        return newDigits;
        
    } 
         
}