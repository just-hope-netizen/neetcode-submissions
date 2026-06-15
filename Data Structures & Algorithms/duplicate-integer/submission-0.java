class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for(int num: nums){
            if( !result.add(num)){
                return true;
            }
        

        }
           return false;
    }

   
}