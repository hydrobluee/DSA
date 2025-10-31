class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        boolean[] id = new boolean[n-2];
        int[] res = new int[2];

        for(int num : nums) id[num] ^= true;

        for(int i=0, curr=0; i<n-2; i++) {
            if(!id[i]) res[curr++] = i;
        }
        return res;
    }
}