class Solution {
    public void sortColors(int[] n) {
        for (int i = 0; i < n.length ; i++) {
          
            for (int j = i + 1  ; j < n.length ; j++) {
              
               if( n[i] > n[j]){
               int temp = n[j];
               n[j] = n[i];
               n[i] = temp;
             
               }
            }
        }

        // while(f < n.length ){
        //   if(n[f] == 0){
        //     int temp = n[s];
        //     n[s] = n[f];
        //     n[f] = temp;
        //     s++;
        //   }
        //     f++;

        // }
    }
}