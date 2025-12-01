class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length,left=0,maxlen=0,zeros=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0) zeros++;
            if(zeros>k){
                if(nums[left]==0) zeros--;
                left++;
            }
            if(zeros<=k){
                maxlen=Math.max(maxlen,right-left+1);
            }
        }
        return maxlen;
    }
}