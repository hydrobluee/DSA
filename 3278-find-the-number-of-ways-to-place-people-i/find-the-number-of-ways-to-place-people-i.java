class Solution {
    private int solve(boolean[][] grid, int r, int c) {
        int cnt = 0;
        int n=50;
        for(int i=r; i<=50; i++) {
            for(int j=c; j<=n; j++) {
                if(i==r && j==c) continue;
                if(grid[i][j]) {
                    cnt++;
                    n = j-1;
                } 
            }
        }
        return cnt;
    }
    public int numberOfPairs(int[][] points) {
        boolean[][] grid = new boolean[51][51];
        for(int[] point : points) {
            grid[50-point[1]][point[0]] = true;
        }
        int cnt = 0;
        for(int i=0; i<=50; i++) {
            for(int j=0; j<=50; j++) {
                if(grid[i][j]) {
                    cnt += solve(grid, i, j);
                }
            }
        }
        return cnt;
    }
}