class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0, r = 0, cut = 0;
        if (s.length() == 0)
            return count;

        List<Character> sub = new ArrayList<>();

        while (r < s.length()) {
            char c = s.charAt(r);
            if (sub.contains(c)) {
                count = count > sub.size() ? count : sub.size();
                cut = sub.indexOf(c);
                for (int i = 0; i <= cut; i++) {
                    sub.remove(0);
                }
            }


            sub.add(c);
            r++;
        }
        count = count > sub.size() ? count : sub.size();
        return count;
    }
}
