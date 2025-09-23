class Solution {
    public int compareVersion(String version1, String version2) {
        int p1 = 0;
        int p2 = 0;

        while(p1<version1.length() && p2<version2.length()){
            int rev1 = 0, rev2 = 0;
            while(p1<version1.length() && version1.charAt(p1)!='.'){
                rev1 = rev1*10+(version1.charAt(p1)-48);
                p1++;
            }
            while(p2<version2.length() && version2.charAt(p2)!='.'){
                rev2 = rev2*10+(version2.charAt(p2)-48);
                p2++;
            }
            if(rev1>rev2) return 1;
            if(rev2>rev1) return -1;
            p1++; p2++;
        }
        if(p1<version1.length()){
            for(int i=p1; i<version1.length(); i++){
                if(version1.charAt(i)-48 > 0) return 1;
            }
        } 
        else{
            for(int i=p2; i<version2.length(); i++){
                if(version2.charAt(i)-48 > 0) return -1;
            }
        }
        return 0;
    }
}