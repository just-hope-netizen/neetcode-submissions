class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder copy = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // if(c)
            if (Character.isLetterOrDigit(ch)) {
                copy.append(ch);
                stk.push(ch);
            }
        }

        for (int i = 0; i < copy.length(); i++) {
            char ch = copy.charAt(i);
            char h = stk.pop();
                     // if(c)
                     if (Character.toLowerCase(ch) != Character.toLowerCase(h)) {
                return false;
            }
        }

        return true;
    }
}
