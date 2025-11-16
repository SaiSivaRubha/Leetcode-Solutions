// User function Template for Java

class Solution {
    static int count(int N) {
        // code here
        int[] dp=new int[N+1];
        dp[0]=1;
        for(int n=2;n<=N;n+=2){
            for(int i=0;i<=n-2;i+=2){
                dp[n]+=dp[i]*dp[n-i-2];
            }
        }
        return dp[N];
    }
};