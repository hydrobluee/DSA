class Solution {
    private boolean noZero(int num) {
        while(num!=0) {
            if(num%10 == 0) return false;
            num /= 10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i=1; i<n; i++) {
            if(noZero(i) && noZero(n-i)) {
                return new int[] {i, n-i};
            }
        }
        return new int[] {-1, -1};
    }
}