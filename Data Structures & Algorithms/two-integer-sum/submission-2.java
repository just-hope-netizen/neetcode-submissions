class Solution {
    public int[] twoSum(int[] nums, int target) {
        // List<Integer> indices = new HashSet<>();
        Map<Integer, Integer> indices = new HashMap<>();

        // for(int i = 0; i < nums.length; i++){
        //     mapNums.put( nums[i], i);
        // }
        for(int i = 0; i < nums.length; i++){
           for(int j = i + 1; j < nums.length; j++){
           if(nums[i] + nums[j] == target ){
            indices.put(i, 0);
            
            indices.put(j, 0);

           }
        }
        }
        List<Integer> list = new ArrayList<>();
        for(Integer ind: indices.keySet()){
list.add(ind);
          
        }
        int[] newNums = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            newNums[i] = list.get(i);
        }
         
        return newNums;
    }
}
