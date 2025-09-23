class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[][] freq = new int[101][2];
        for(int i=0; i<101; i++) freq[i][0] = i;
        for(int num : nums) freq[num][1]++;

        Arrays.sort(freq, (a, b) -> b[1]-a[1]);
        int cnt = freq[0][1];
        for(int i=1; i<101 && freq[i][1]==freq[i-1][1]; i++) 
            cnt += freq[0][1];
        

        return cnt;

    }
}