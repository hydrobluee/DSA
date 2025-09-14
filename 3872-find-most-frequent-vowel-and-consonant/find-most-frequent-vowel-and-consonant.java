class Solution {
    private boolean isVowel(char c) {
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()) freq[c-'a']++;
        
        int maxV = 0;
        int maxC = 0;
        for(int i=0; i<26; i++) {
            if(freq[i]==0) continue;
            if(isVowel((char)(i+'a'))) maxV = Math.max(maxV, freq[i]);
            else maxC = Math.max(maxC, freq[i]);
        }

        return maxV + maxC;
    }
}