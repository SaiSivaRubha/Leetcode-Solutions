//this is a modified one
class Solution {
    public int findingValid(int n,int k){
    if(n==1) return 0;
        return (findingValid(n-1,k)+k)%n;
    }
    public int findTheWinner(int n, int k) {
        int ans=findingValid(n,k)+1;
        return ans;
    }
}
