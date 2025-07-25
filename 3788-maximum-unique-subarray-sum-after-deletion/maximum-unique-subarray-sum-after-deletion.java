class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = -1000;
        for(int num : nums) {
            set.add(num);
            max = Math.max(max, num);
        }
        int sum = 0;
        for(Integer num : set) {
            sum += num>0 ? num : 0;
        }
        return sum!=0 ? sum : max;
    }
}