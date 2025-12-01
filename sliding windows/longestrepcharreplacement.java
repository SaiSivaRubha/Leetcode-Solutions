class Solution {
    public int characterReplacement(String s, int k) {
        long count=0,maxlen=0,n=s.length(),maxfreq=0;
        int left=0;
        int[] freq=new int[26];
        for(int right=0;right<n;right++){
            freq[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);
            while((right-left+1)-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            if((right-left+1)-maxfreq<=k)
            maxlen=Math.max(maxlen,right-left+1);
        }
        return (int)maxlen;
    }
}