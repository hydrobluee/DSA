class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] numsWithInd = new int[n][2];

        for(int i=0; i<n; i++) {
            numsWithInd[i][0] = i;
            numsWithInd[i][1] = nums[i];
        }

        Arrays.sort(numsWithInd, (a, b) -> b[1]-a[1]);

        int[][] tem = new int[k][2];
        for(int i=0; i<k; i++) {
            tem[i][0] = numsWithInd[i][0];
            tem[i][1] = numsWithInd[i][1];
        } 

        Arrays.sort(tem, (a, b) -> a[0]-b[0]);

        int[] res = new int[k];
        for(int i=0; i<k; i++) res[i] = tem[i][1];

        return res;
    }
}