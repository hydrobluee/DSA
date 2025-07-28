class Solution {
    private int solve(int[] arr, int maxOr, int or, int i){
        //base
        if(i==arr.length) return or==maxOr ? 1 : 0;
        return solve(arr, maxOr, or|arr[i], i+1) + 
            solve(arr, maxOr, or, i+1);
    }
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for(int n : nums) maxOr |= n;
        return solve(nums, maxOr, 0, 0);
    }
}