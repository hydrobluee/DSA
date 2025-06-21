class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for(char c : word.toCharArray()) freq[c-'a']++;
        Arrays.sort(freq);

        int res = word.length();
        for(int i=0; i<26; i++) {
            int a = freq[i];
            if(a == 0) continue; // ignore letters that dosen't exits in word
            int delete = 0;
            for(int j=0; j<26; j++) {
                int b = freq[j];
                if(b == 0) continue;
                if(a > b) delete += b;
                else if (b > a+k) {
                    delete += b - (a+k);
                }
            }
            res = Math.min(res, delete);
        }

        return res;
    }
}