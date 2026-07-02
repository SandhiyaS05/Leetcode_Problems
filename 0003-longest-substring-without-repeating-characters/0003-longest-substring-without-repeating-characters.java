class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        int maxlen=0,i;
        for(i=0;i<len;i++){
            HashMap<Character,Integer> h1=new HashMap<>();
            for(int j=i;j<len;j++){
                var it=h1.get(s.charAt(j));
                if(it!=null){
                    break;
                }
                h1.put(s.charAt(j),1);
                maxlen=Math.max(maxlen,j-i+1);
            }
        }
        return maxlen;
    }
}