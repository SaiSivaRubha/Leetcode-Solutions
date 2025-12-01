class Solution {
    public void findingValid(int k,int n,List<List<Integer>> lst,List<Integer> arr,int num,int i){
        if(i==k){
            if(n==0){
                lst.add(new ArrayList<>(arr));
               
            }
             return;
        }
        if(n<0 || num>9||i>k) return;
        

        arr.add(num);
        findingValid(k,n-num,lst,arr,num+1,i+1);
        arr.remove(arr.size()-1);
        findingValid(k,n,lst,arr,num+1,i);
        
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> lst=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        findingValid(k,n,lst,arr,1,0);
        return lst;
    }
}