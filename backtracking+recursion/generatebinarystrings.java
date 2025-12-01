class Solution {
    public void findingValid(int n,String s,List<String> lst){
        if(s.length()==n){
            lst.add(s);
            return;
        }
        if(s.isEmpty()|| (s.charAt(s.length()-1)=='1')){ findingValid(n,s+"1",lst);
        findingValid(n,s+"0",lst);
        }
        else if(s.charAt(s.length()-1)=='0') findingValid(n,s+"1",lst);
        
    }
    public List<String> validStrings(int n) {
        List<String> lst=new ArrayList<>();
        String s="";
        findingValid(n,s,lst);
        return lst;
    }
}