class ValidParentheses {
    public boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();
  
      for (char c : s.toCharArray()) {
        if (c == '(' || c == '[' || c == '{') {
          stack.push(c); // Push opening brackets onto the stack
        } else {
          // Check for closing brackets
          if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
            return false;
          }
        }
      }
  
      // After processing all characters, the stack should be empty
      return stack.isEmpty();
    }
  
    private boolean isMatchingPair(char opening, char closing) {
      return (opening == '(' && closing == ')') ||
             (opening == '[' && closing == ']') ||
             (opening == '{' && closing == '}');
    }
  }
  