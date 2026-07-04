class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h1=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char ch:s.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)-1);
        }
        for(var it: h1.entrySet()){
            if(it.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}