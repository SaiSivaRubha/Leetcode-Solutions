class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> need=new HashMap<>();
        Map<Character,Integer> have=new HashMap<>();
        int left=0,right=0;
        for(int i=0;i<s1.length();i++){
            need.put(s1.charAt(i),need.getOrDefault(s1.charAt(i),0)+1);
        }
        while(right<s2.length()){
            have.put(s2.charAt(right),have.getOrDefault(s2.charAt(right),0)+1);
            if(!need.containsKey(s2.charAt(right))){
                right=right+1;
                left=right;
                have.clear();
                continue;
            }
            char c=s2.charAt(right);
            while(have.get(c)>need.get(c)){
                have.put(s2.charAt(left),have.get(s2.charAt(left))-1);
                left++;
            }
            int wsize=right-left+1;
            if(wsize==s1.length()) return true;
            right++;
        }
        return false;
    }
}