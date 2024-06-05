class Solution {
    public int removeDuplicates(int[] nums) {
      if (nums.length == 0) {
        return 0;
      }
  
      int i = 0; // pointer for the next unique element
  
      // Iterate through the array
      for (int j = 1; j < nums.length; j++) {
        // If the current element is different from the previous element
        if (nums[j] != nums[i]) {
          // Increment i to point to the next slot for a unique element
          i++;
          // Overwrite the element at i with the current element (unique)
          nums[i] = nums[j];
        }
      }
  
      // Return the number of unique elements (i + 1)
      return i + 1;
    }
  }
  