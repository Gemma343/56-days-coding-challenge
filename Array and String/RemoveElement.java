class RemoveElement {
    public int removeElement(int[] nums, int val) {
      int i = 0; // pointer for keeping track of non-val elements
  
      // Iterate through the array
      for (int j = 0; j < nums.length; j++) {
        // If the current element is not equal to the value to remove
        if (nums[j] != val) {
          // Swap the elements at indices i and j (overwrite val with non-val element)
          nums[i] = nums[j];
          i++; // increment i to point to the next non-val slot
        }
      }
  
      // Return the number of elements that are not equal to the value
      return i;
    }
  }
  