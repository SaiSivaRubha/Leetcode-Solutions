class Solution {
    public void findingValid(int n,List<List<Integer>> lst,List<Integer> arr,int[] nums,int i){
        if(i==n){
            if(!lst.contains(arr)){
            
            lst.add(new ArrayList<>(arr));
            return;
        }
        }
        if(i<n){
         arr.add(nums[i]);
        findingValid(n,lst,arr,nums,i+1);
         arr.remove(arr.size()-1);
         findingValid(n,lst,arr,nums,i+1);
        }
        
        

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lst=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        findingValid(n,lst,arr,nums,0);
        return lst;
    }
}