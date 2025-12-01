class Solution {
    public void  findingValid(int n,String s,List<String> lst,int open,int close){
        if(s.length()==2*n){
            lst.add(s);
        }
        if(open<n) findingValid(n,s+"(",lst,open+1,close);
        if(close<open) findingValid(n,s+")",lst,open,close+1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> lst=new ArrayList<>();
        String s="";
        int open=0,close=0;
        findingValid(n,s,lst,open,close);
        return lst;
    }
}