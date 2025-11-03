class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = neededTime.length;
        int time = 0;
        for(int i=0; i<n-1; i++) {
            if(colors.charAt(i)!=colors.charAt(i+1)) continue;
            int sum = neededTime[i];
            int max = neededTime[i];
            int j=i+1;
            for( ; j<n && colors.charAt(j)==colors.charAt(j-1); j++) {
                sum += neededTime[j];
                max = Math.max(max, neededTime[j]);
            }
            time += sum-max;
            i = j-1;
        }
        return time;
    }
}