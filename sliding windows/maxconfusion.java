class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        long n=answerKey.length(),maxlen=0,maxfreq=0;
        int left=0;
        int[] freq=new int[26];
        for(int right=0;right<n;right++){
            freq[answerKey.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,freq[answerKey.charAt(right)-'A']);
            while((right-left+1)-maxfreq>k){
                freq[answerKey.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,(right-left+1));
        }
        return  (int)maxlen;
    }
}