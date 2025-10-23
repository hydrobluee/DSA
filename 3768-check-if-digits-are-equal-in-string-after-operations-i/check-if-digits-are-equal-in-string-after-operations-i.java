class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length()>2) {
            StringBuilder tem = new StringBuilder();
            for(int i=0; i<sb.length()-1; i++) {
                int a = sb.charAt(i)-48;
                int b = sb.charAt(i+1)-48;
                int total = (a+b)%10;
                tem.append(total);
            }
            sb = tem;
        }
        return sb.charAt(0)==sb.charAt(1);
    }
}