class Solution {
    public long getDescentPeriods(int[] prices) {
        long des=0, sum=0;
        int prev = -1;
        for(int x : prices) {
            des = (x+1==prev ? des:0) + 1;
            sum += des;
            prev = x;
        }
        return sum;
    }
}