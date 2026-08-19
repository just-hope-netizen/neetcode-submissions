class Solution {
    public int trap(int[] h) {
        int lMax = 0, rMax = 0, l = 0, r = h.length - 1, total = 0;

        while (l < r) {
            if (h[r] > h[l]) {
                if (h[l] > lMax)
                    lMax = h[l];
                else
                    total += lMax - h[l];
                l++;
            } else {
                if (h[r] > rMax)
                    rMax = h[r];
                else
                    total += rMax - h[r];
                r--;
            }
        }
        return total;
    }
}
