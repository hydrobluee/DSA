class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for(String op : operations) {
            if(op.charAt(0)=='-' || op.charAt(2)=='-') res--;
            else res++;
        }
        return res;
    }
}