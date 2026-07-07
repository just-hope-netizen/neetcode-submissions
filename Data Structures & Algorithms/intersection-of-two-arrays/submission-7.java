class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer>  intersectionArr =  new HashSet<>();

       if(nums1.length > nums2.length){

        for(int i = 0; i <= nums1.length - 1; i++){
             for(int j = 0; j <= nums2.length - 1; j++){
             if(nums1[i] == nums2[j]){
                intersectionArr.add(nums2[j]);
                    }
            }
        
        }
       }else{
        for(int i = 0; i <= nums2.length - 1; i++){
             for(int j = 0; j <= nums1.length - 1; j++){
             if(nums2[i] == nums1[j]){
                intersectionArr.add(nums1[j]);
                    }
            }
        
        }
       }
       
        int[] newArr = new int[intersectionArr.size()];
        List<Integer> jk = new ArrayList<>(intersectionArr);
        for(int i = 0; i <= newArr.length - 1; i++){
        newArr[i] = jk.get(i);
        }
        return newArr;
    }
}