class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long ans = 0;
        for(int i=0; i<n; i++) {
            if(nums[i]!=0) continue;
            int j=i;
            while(j<n && nums[j]==0) j++;
            int subArr = j-i;
            ans += (long) subArr*(subArr+1)/2;
            i = j;
        }
        return ans;
    }
}