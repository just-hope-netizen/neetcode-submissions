class Solution {
   public int maxArea(int[] h) {
        int l = 0, r = h.length - 1;
        SortedSet<Integer> sizes = new TreeSet<>();

        while(l < r){
            int conH;
             int width;
            if(h[l] > h[r]){
            conH =  h[r]; 
            width = r -  l;
                r--;
            }else{
              conH = h[l];
              width = r -  l;
            l++;
            }
          

            int maxSize = conH * width;
            sizes.add(maxSize);
        }

      
           return sizes.last();
       
    }
}
