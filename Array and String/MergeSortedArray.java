class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      // i points to the last element of nums1 (excluding the trailing 0s)
      int i = m - 1;
      // j points to the last element of nums2
      int j = n - 1;
      // k points to the last element of the merged array (filling from the back)
      int k = m + n - 1;
  
      // Iterate while there are elements in both nums1 and nums2
      while (i >= 0 && j >= 0) {
        // If the element in nums1 is greater, copy it to the merged array and decrement i
        if (nums1[i] > nums2[j]) {
          nums1[k--] = nums1[i--];
        } else {
          // If the element in nums2 is greater, copy it to the merged array and decrement j
          nums1[k--] = nums2[j--];
        }
      }
  
      // Copy the remaining elements of nums2 (if any) to the merged array
      while (j >= 0) {
        nums1[k--] = nums2[j--];
      }
    }
  }
  