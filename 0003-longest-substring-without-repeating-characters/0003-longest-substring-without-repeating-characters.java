class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        int maxlen=0,left=0,right=0;
        HashMap<Character,Integer> h1=new HashMap<>();
        while(right<len){
            while(left<right&&h1.containsKey(s.charAt(right))==true){
               h1.remove(s.charAt(left));
               left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            h1.put(s.charAt(right),1);
            right++;
        }
        
        return maxlen;
    }
}