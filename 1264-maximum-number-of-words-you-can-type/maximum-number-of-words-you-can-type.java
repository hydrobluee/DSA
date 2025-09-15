class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int cnt = 0;
        for(String word : words) {
            boolean canFullyType = true;
            for(char c : brokenLetters.toCharArray()) {
                if(word.contains(String.valueOf(c))) {
                    canFullyType = false;
                    break;
                }  
            }
            cnt += canFullyType ? 1 : 0;
        }
        return cnt;
    }
}