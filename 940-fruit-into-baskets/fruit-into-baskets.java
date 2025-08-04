class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0, ans = 0;
        for(int r=0; r<fruits.length; r++) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            while(map.size() > 2) {
                int tem = map.get(fruits[l]) - 1;
                if(tem==0) map.remove(fruits[l]);
                else map.replace(fruits[l], tem);
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}