class Solution {
    public static boolean checkInclusion(String s1, String s2) {
        int r = s1.length() - 1, l = 0;

        while (r < s2.length()) {
            int count = 0;
            List<Character> sb = new ArrayList<>();

            for (int j = l; j <= r; j++) {
                char c = s2.charAt(j);
                sb.add(c);
            }
            for (int j = 0; j < s1.length(); j++) {
                char c = s1.charAt(j);
                Character n = c;

                if (sb.contains(n)) {
                    count++;
                    sb.remove(n);
                }
            }
            if (count == s1.length())
                return true;
            r++;
            l++;
        }

        return false;
    }
}
