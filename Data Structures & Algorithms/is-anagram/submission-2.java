class Solution {
    public boolean isAnagram(String s, String t) {
        char[] fS = s.toCharArray();
        char[] tS = t.toCharArray();
        Arrays.sort(fS);
        Arrays.sort(tS);
        String fsS = new String(fS);
        String tsS = new String(tS);
        if(fsS.equals(tsS)){
            return true;
        }
            return false;

    }
}
