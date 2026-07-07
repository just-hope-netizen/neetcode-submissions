class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer>  nums1Set =  new HashSet<>();
       List<Integer> interArr = new ArrayList<>();

        for(int i = 0; i <= nums1.length - 1; i++){
        nums1Set.add(nums1[i]);
        }

       for(int num: nums2){
            if(nums1Set.contains(num)){
                interArr.add(num);
                nums1Set.remove(num);
            }
       }
      
       
        int[] newArr = new int[interArr.size()];
        for(int i = 0; i <= newArr.length - 1; i++){
        newArr[i] = interArr.get(i);
        }
        return newArr;
    }
}