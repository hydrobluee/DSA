class Solution {
    public int numberOfBeams(String[] bank) {
        int r = bank.length;
        int[] freq = new int[r];
        for(int i=0; i<r; i++) {
            int sum = 0;
            for(char c : bank[i].toCharArray()) sum += c-48;
            freq[i] = sum;
        }
        int top = freq[0];
        int total = 0;
        for(int i=1; i<r; i++) {
            if(freq[i]==0) continue;
            total += top*freq[i];
            top = freq[i];
        }
        return total;
    }
}