class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        int n = arr.length;
        Set<Integer> res = new HashSet<>();
        Set<Integer> prev = new HashSet<>();

        for(int val : arr) {
            Set<Integer> next = new HashSet<>();
            next.add(val);

            for(int x : prev) next.add(x | val);

            res.addAll(next);
            prev = next;
        }
        
        return res.size();
    }
}