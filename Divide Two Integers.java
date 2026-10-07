class Solution {
    public int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int count = 0;

        while (a >= b) {
            a = a - b;
            count++;
        }

        // If signs are different
        if ((dividend < 0) != (divisor < 0)) {
            count = -count;
        }

        return count;
    }
}