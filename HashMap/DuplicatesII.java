
class DuplicatesII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashMap<Integer, Integer> map = new HashMap<>();
  
      for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
        if (map.containsKey(num)) {
          int prevIndex = map.get(num);
          if (i - prevIndex <= k) { // Check if within the range k
            return true;
          }
        }
        map.put(num, i); // Update map with current number and its index
      }
  
      return false; // No duplicates found within range k
    }
  }
  