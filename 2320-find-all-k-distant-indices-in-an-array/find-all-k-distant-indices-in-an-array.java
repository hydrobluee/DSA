class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int j=0; j<n; j++) {
            if(nums[j]!=key) continue;
            int s = Math.max(j-k, 0);
            int e = Math.min(j+k, n-1);
            for(int i=s; i<=e; i++) set.add(i);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}