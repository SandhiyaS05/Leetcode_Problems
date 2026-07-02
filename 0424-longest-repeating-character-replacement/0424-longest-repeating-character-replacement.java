class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash=new int[26];
        int left=0,freq=0,maxlen=0;
        for(int right=0;right<s.length();right++){
            hash[s.charAt(right)-'A']++;
            freq=Math.max(freq,hash[s.charAt(right)-'A']);
            while((right-left+1)-freq>k){
                hash[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}