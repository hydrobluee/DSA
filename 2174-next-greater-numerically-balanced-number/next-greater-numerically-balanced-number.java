class Solution {
    private boolean balanced(int num) {
        int[] freq = new int[10];
        for(int i=num; i!=0; i/=10) freq[i%10]++;
        for(int i=0; i<10; i++) 
            if(freq[i]!=0 && i!=freq[i]) 
                return false;
        return true;
    }
    public int nextBeautifulNumber(int n) {
        for(int i=n+1; ; i++) if(balanced(i)) return i;
    }
}