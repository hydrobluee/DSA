class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for(int n : nums) max=Math.max(max, n);
        int c = 0;
        int res=0;
        for(int n : nums){
            if(n==max) c++;
            else{
                res=Math.max(res, c);
                c=0;
            }
        }
        res=Math.max(res,c);
        return res;
    }
}