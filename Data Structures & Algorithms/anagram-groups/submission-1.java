class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> grouped = new HashMap<>();

        for(String  str:strs){
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sorStr = new String(strArr);
            grouped.computeIfAbsent(sorStr, k ->  new ArrayList<>()).add(str);
        }

        List<List<String>> anagrams = new ArrayList<>( );
        for(List<String>  val: grouped.values()){
            anagrams.add( val);
         }
       
        return anagrams;
    }
}
