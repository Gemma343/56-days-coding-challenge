
class Solution {
    public boolean isPalindrome(int x) {
        // Check if x is negative
        if (x < 0) {
            return false;
        }

        // Check if x has a non-zero remainder when divided by 10
        if (x != 0 && x % 10 == 0) {
            return false;
        }

        // Reverse the second half of x
        int reversed = 0;
        while (x > reversed) {
            // Get the last digit of x
            int lastDigit = x % 10;

            // Add the last digit to the reversed integer
            reversed = reversed * 10 + lastDigit;

            // Remove the last digit from x
            x /= 10;
        }

        // Check if x is equal to its reverse
        return x == reversed || x == reversed / 10;
    }
}