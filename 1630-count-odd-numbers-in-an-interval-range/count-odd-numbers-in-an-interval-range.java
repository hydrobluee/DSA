class Solution {
    public int countOdds(int low, int high) {
        int extra = (low%2==1 && high%2==1) ? 1 : 0;
        return (high-low+1) / 2 + extra;
    }
}