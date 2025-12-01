class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int d=(int)Arrays.stream(nums).distinct().count();
        Map<Integer,Integer> map=new HashMap<>();
        int left=0,ans=0,n=nums.length;
        for(int right=0;right<n;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(d==map.size()){
                ans+=n-right;
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0) map.remove(nums[left]);
                left++;
            }
        }
        return ans;

    }
}