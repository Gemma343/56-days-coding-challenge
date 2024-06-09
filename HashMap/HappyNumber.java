
class HappyNumber {
    public boolean isHappy(int n) {
      Set<Integer> seenNumbers = new HashSet<>(); // Set to store seen numbers
  
      while (n != 1 && !seenNumbers.contains(n)) {
        int next = calculateNext(n);
        seenNumbers.add(n); // Add current number to seen set
        n = next;
      }
  
      return n == 1; // Happy if reaches 1, not happy if cycle detected
    }
  
    private int calculateNext(int num) {
      int sum = 0;
      while (num > 0) {
        int digit = num % 10;
        sum += digit * digit;
        num /= 10;
      }
      return sum;
    }
  }
  