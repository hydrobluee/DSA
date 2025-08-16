class Solution {
    public int maximum69Number (int num) {
        int index = -1;
        for(int val=num, i=0; val!=0; val/=10, i++) {
            if(val%10==6) index = i;
        }
        if(index!=-1) return num + 3*(int)Math.pow(10, index);
        return num;
    }
}