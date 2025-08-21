class Solution {
    private int solve(int i, int j, int[][] mat, int[][] memo) {
        if(i>=mat.length || j>=mat[0].length || mat[i][j]==0) return 0;

        if(memo[i][j]!=0) return memo[i][j];

        int right = solve(i, j+1, mat, memo);
        int diag = solve(i+1, j+1, mat, memo);
        int down = solve(i+1, j, mat, memo);

        return memo[i][j] = 1 + Math.min(right, Math.min(diag, down));
    }

    public int countSquares(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] memo = new int[m][n];
        int squares = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                squares += solve(i, j, matrix, memo);
            }
        }
        return squares;
    }
}