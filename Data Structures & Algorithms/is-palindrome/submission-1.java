class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            char lV = s.charAt(l);
            char rV = s.charAt(r);
            if (Character.isLetterOrDigit(lV) && Character.isLetterOrDigit(rV)) {
                if (Character.toLowerCase(lV) != Character.toLowerCase(rV)) {
                    return false;
                }
                r--;
                l++;

            } else if (Character.isLetterOrDigit(rV) == false) {
                r--;

            } else {
                l++;
            }
        }

        return true;
    }
}
