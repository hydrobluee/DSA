class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean vowel = false, conso = false;
        for(char c : word.toCharArray()) {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                c=='A' || c=='E' || c=='I' || c=='O' || c=='U'
            ) vowel = true;
            else if((c>='a' && c<='z') || (c>='A' && c<='Z')) conso = true;
            else if(c>='0' && c<='9') continue;
            else return false;
        }
        return vowel && conso;
    }
}