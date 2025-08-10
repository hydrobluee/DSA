class Solution {
    private int[] freq(int num) {
        int[] freq = new int[10];
        while(num!=0) {
            freq[num%10]++;
            num/=10;
        }
        return freq;
    }
    private boolean compare(int[] freq1, int[] freq2) {
        for(int i=0; i<10; i++) {
            if(freq1[i]!=freq2[i]) return false;
        }
        return true;
    } 
    public boolean reorderedPowerOf2(int n) {
        int[] numFreq = freq(n);
        for(int i=0; i<31; i++) {
            int[] freq = freq(1<<i);
            if(compare(numFreq, freq)) return true;
        }
        return false;
    }
}