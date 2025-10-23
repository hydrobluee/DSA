class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length()>2) {
            StringBuilder tem = new StringBuilder();
            for(int i=0; i<s.length()-1; i++) {
                int a = s.charAt(i)-48;
                int b = s.charAt(i+1)-48;
                int total = (a+b)%10;
                tem.append(total);
            }
            s = tem.toString();
        }
        return s.charAt(0)==s.charAt(1);
    }
}