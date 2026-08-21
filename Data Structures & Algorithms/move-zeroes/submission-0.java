class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast= slow;
        while( fast < nums.length){
            if(nums[fast] != 0){
                   int temp = nums[slow];
                   nums[slow] = nums[fast];
                   nums[fast] = temp;
                   slow++;
                }
                 fast++;
           
        }
        
    }
}