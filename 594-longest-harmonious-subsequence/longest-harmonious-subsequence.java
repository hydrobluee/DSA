class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int f = 0;
        int max = 0;
        for(int i=1; i<n; i++) {
            if(nums[i]==nums[i-1]) continue;
            int j = i+1;
            while(j<n && nums[j]==nums[j-1]) j++;
            if(nums[i]-nums[f]==1) {
                max = Math.max(max, j-f);
            }
            f=i; i=j-1;
        }
        return max;
    }
}