class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> elementFrequency = new  HashMap();
        for (int n: nums){
            elementFrequency.put(n, elementFrequency.getOrDefault(n, 0) +1);
        }

        // bucket sort to move high frequent element forward
        // index = freq , value = element
        // *** bucket index 0 has not value because all element appears once
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int n : elementFrequency.keySet()){
           int val = elementFrequency.get(n);
           if(bucket[val] == null){
            bucket[val] = new ArrayList<>();
           }
           bucket[val].add(n);
        }
     List<Integer> sortedBucket = new ArrayList<>();
        //remove empty bucket 
        for(int i = bucket.length-1; i > 0; i--){
            if(bucket[i] != null){
                for(int n : bucket[i]){

sortedBucket.add(n);
                }
            }
        }
     int[] sol= new int[k];
        int counter = 0;
        while(k > counter){
sol[counter] = sortedBucket.get(counter);
counter++;
        }

    
        return sol;
    }
}
