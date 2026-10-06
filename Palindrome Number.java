class Solution {
    public static boolean isPalindrome(int x) {
        int res = 0;
        int x1 = x;

        while (x1 > 0) {
            int rem = x1 % 10;
            res = res * 10 + rem;
            x1 /= 10;
        }

        if (x < 0) {
            return false;
        } else if (x == res) {
            return true;
        } else {
            return false;
        }
    }
}