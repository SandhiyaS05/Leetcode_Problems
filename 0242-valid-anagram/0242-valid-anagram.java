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
            if(!h1.containsKey(ch)){
                return false;
            }
            h1.put(ch,h1.getOrDefault(ch,0)-1);
            if(h1.get(ch)==0) h1.remove(ch);
        }
        
        return h1.isEmpty();
    }
}