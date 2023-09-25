class Solution {
    public int divide(int dividend, int divisor) {
        // Handle special cases
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        
        // Determine the sign of the result
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        
        // Convert both dividend and divisor to positive to simplify the calculation
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        
        // Initialize the result to 0
        long quotient = 0;
        
        // Perform the division
        while (absDividend >= absDivisor) {
            long temp = absDivisor;
            long multiple = 1;
            
            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            
            absDividend -= temp;
            quotient += multiple;
        }
        
        // Apply the sign to the result
        int result = (int) (sign * quotient);
        
        return result;
    }
}
