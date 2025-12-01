class Solution {
    public void findingValid(int n,List<List<Integer>> lst,List<Integer> arr,int i,int[] nums){
        if(i==n){
            lst.add(new ArrayList<>(arr));
            return;
        }
        findingValid(n,lst,arr,i+1,nums);
        arr.add(nums[i]);
        findingValid(n,lst,arr,i+1,nums);
        arr.remove(arr.size()-1);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        findingValid(n,lst,arr,0,nums);
        return lst;
    }
}