class Solution {
    public void findingValid(String s,List<String> lst,String  digits,int index){
        if(index==digits.length()){
            lst.add(s);
            return;
        }
        int digit=digits.charAt(index)-'0';
        int start=(digit-2)*3;
        int end=start+3;
        if(digit==7){
            end=end+1;
        }
        if(digit==8){
            start=start+1;
            end=end+1;
        
        }
        if(digit==9) { start=start+1;end=end+2;}

        for(int i=start;i<end;i++){
            char ch=(char)('a'+i);
            findingValid(s+ch,lst,digits,index+1);
        }
    }
    public List<String> letterCombinations(String digits) {
       List<String> lst=new ArrayList<>();
       String s="";
       int index=0;
       findingValid(s,lst,digits,index);
       return lst;

    }
}