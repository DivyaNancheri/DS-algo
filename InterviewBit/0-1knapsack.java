public class Solution {
    public int solve(int[] v, int[] w, int k) {
        int n=v.length;
        int[][] dp =new int[n+1][k+1];
        for(int j=0;j<k+1;j++){
            dp[0][j]=0;
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=0;j<k+1;j++){
                dp[i][j]=Math.max(dp[i-1][j], (j>=w[i-1]) ? dp[i-1][j-w[i-1]]+v[i-1] : 0);
            }
        }
        return dp[n][k];
    }
}
