class Solution {
    public int maxDistance(String str, int k) {
        int n=0, s=0, e=0, w=0;
        int dist = 0;
        for(char c : str.toCharArray()) {
            switch(c) {
                case 'N' -> n++;
                case 'S' -> s++;
                case 'E' -> e++;
                case 'W' -> w++;
            }
            int md = Math.abs(e-w) + Math.abs(n-s);
            int maxChange = Math.min(k, Math.min(n, s)+Math.min(e, w));
            dist = Math.max(dist, md + maxChange*2);
        }
        return dist;
    }
}