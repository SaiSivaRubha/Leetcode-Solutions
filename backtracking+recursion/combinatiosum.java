class Solution {
    public void findingValid(int[] candidates,List<List<Integer>> lst,List<Integer> arr,int target,int i){
        if(target==0){ 
            lst.add(new ArrayList<>(arr));
            return;
        }
        if(target<0||i==candidates.length) return;
         
        if(candidates[i]<=target){
               arr.add(candidates[i]);
               findingValid(candidates,lst,arr,target-candidates[i],i);
               arr.remove(arr.size()-1);
            }
       findingValid(candidates,lst,arr,target,i+1);
       

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lst=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        findingValid(candidates,lst,arr,target,0);
        return lst;
    }
}