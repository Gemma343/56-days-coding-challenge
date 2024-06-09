class TwoSum {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> map = new HashMap<>();
  
      for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
          return new int[]{map.get(complement), i}; // Found the pair
        }
        map.put(nums[i], i); // Add current number and index to the map
      }
  
      throw new IllegalArgumentException("No two sum solution"); // No solution found
    }
  }
  