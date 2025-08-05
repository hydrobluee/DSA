class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int start = 0, cnt = 0;
        for(int i=0; i<n; i++) {
            int j = start;
            while(j<n) {
                if(baskets[j]>=fruits[i]) {
                    baskets[j] = -1;
                    cnt++; break;
                }
                j++;
            }
            if(j==start) start++;
            if(start==n) break;
        }
        return n-cnt;
    }
}