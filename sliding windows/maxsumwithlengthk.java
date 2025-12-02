class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int left=0;long currsum=0,sum=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            currsum+=nums[right];
            if(right-left+1>k){
                map.put(nums[left],map.get(nums[left])-1);
                currsum-=nums[left];
                if(map.get(nums[left])==0) map.remove(nums[left]);
                left++;
            }
            if(map.size()==k && right-left+1==k){
                sum=Math.max(sum,currsum);
            }

        }
        return sum;
    }
}