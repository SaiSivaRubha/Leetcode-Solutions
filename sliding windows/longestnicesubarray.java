class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int max=0;
        int left=0,num=0;
        for(int right=0;right<n;right++){
            while((num & nums[right])!=0){
                num=num^nums[left];
                left++;
            }
            num|=nums[right];
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}