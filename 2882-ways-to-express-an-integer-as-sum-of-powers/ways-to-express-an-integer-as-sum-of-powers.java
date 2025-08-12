class Solution {
    private final int MOD = 1_000_000_007;
    private int[][] memo = new int[301][301];
    private int solve(int n, int i, int x) {
        if(n==0) return 1;
        if(n<0) return 0;
        
        int curr = (int) Math.pow(i, x);
        if(n-curr < 0) return 0;

        if(memo[n][i]!=0) return memo[n][i];

        int take = solve(n-curr, i+1, x);
        int ignore = solve(n, i+1, x);

        return memo[n][i] = (take+ignore) % MOD;
    }
    public int numberOfWays(int n, int x) {
        return solve(n, 1, x);
    }
}