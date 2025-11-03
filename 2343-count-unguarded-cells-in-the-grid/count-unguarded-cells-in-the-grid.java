class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char[][] grid = new char[m][n];
        for(int[] guard : guards) grid[guard[0]][guard[1]] = 'G';
        for(int[] wall : walls) grid[wall[0]][wall[1]] = 'W';
        
        for(int[] guard : guards) {
            int r = guard[0];
            int c = guard[1];
            
            //right
            for(int i=c+1; i<n; i++) {
                if(grid[r][i]=='W' || grid[r][i]=='G') break;
                else grid[r][i] = 'R';
            }
            //left
            for(int i=c-1; i>=0; i--) {
                if(grid[r][i]=='W' || grid[r][i]=='G') break;
                else grid[r][i] = 'R';
            }

            //up
            for(int i=r-1; i>=0; i--) {
                if(grid[i][c]=='W' || grid[i][c]=='G') break;
                else grid[i][c] = 'R';
            }
            //down
            for(int i=r+1; i<m; i++) {
                if(grid[i][c]=='W' || grid[i][c]=='G') break;
                else grid[i][c] = 'R';
            }
        }

        int cnt=0;
        for(char[] row : grid) {
            for(char cell : row) if(cell==0) cnt++;
        }
        return cnt;
    }
}