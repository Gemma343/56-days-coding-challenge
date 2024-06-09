class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
      if (strs.length == 0) return ""; // Empty array returns empty prefix
      String prefix = strs[0]; // Initialize with the first string
  
      for (int i = 1; i < strs.length; i++) {
        while (!strs[i].startsWith(prefix)) {
          // Shorten the prefix if it doesn't match the beginning of current string
          prefix = prefix.substring(0, prefix.length() - 1);
          if (prefix.isEmpty()) { // No common prefix found
            return "";
          }
        }
      }
  
      return prefix;
    }
  }
  