class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for(int num : nums) freq[num]++;
        Arrays.sort(freq);
        int cnt = freq[100];
        for(int i=99; i>=0 && freq[i]==freq[i+1]; i--) 
            cnt += freq[100];

        return cnt;

    }
}