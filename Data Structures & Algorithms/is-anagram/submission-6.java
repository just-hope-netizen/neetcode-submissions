class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mark = new int[26];

        for (int i = 0; i < s.length(); i++) {
            mark[s.charAt(i) - 'a']++;
            mark[t.charAt(i) - 'a']--;
        }

        for (int i : mark) {
            if (i != 0)
                return false;
        }

        return true;
    }
}
