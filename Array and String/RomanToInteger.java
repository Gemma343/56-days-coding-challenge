public class RomanToInteger {
    public int romanToInt(String s) {
      // Define a map for symbol-value mapping
      Map<Character, Integer> symbolValues = new HashMap<>();
      symbolValues.put('I', 1);
      symbolValues.put('V', 5);
      symbolValues.put('X', 10);
      symbolValues.put('L', 50);
      symbolValues.put('C', 100);
      symbolValues.put('D', 500);
      symbolValues.put('M', 1000);
  
      int total = 0;
      int i = 0;
  
      while (i < s.length()) {
        int current = symbolValues.get(s.charAt(i));
        if (i + 1 < s.length() && current < symbolValues.get(s.charAt(i + 1))) {
          total += symbolValues.get(s.charAt(i + 1)) - current;
          i += 2;
        } else {
          total += current;
          i++;
        }
      }
  
      return total;
    }
  }