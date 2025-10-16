class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] rem = new int[value];
        for(int num : nums) {
            int r = ((num%value)+value)%value;
            rem[r]++;
        }
        int ans = 0;
        while(rem[ans%value]-- > 0) ans++;

        return ans;
    }
}