class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Move the left pointer to the next alphanumeric character
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            
            // Move the right pointer to the previous alphanumeric character
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            
            // Check if the current characters are equal, case-insensitive
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            // Move both pointers towards the center
            left++;
            right--;
        }
        
        return true;
    }
}