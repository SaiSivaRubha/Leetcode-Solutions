class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length(),cnt=0;
        int[] hash={-1,-1,-1};
        for(int i=0;i<n;i++){
            hash[s.charAt(i)-'a']=i;
            cnt=cnt+(1+Math.min(Math.min(hash[0],hash[1]),hash[2]));
        }
        return cnt;
    }
}