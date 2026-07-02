class Solution {
    public int longestSubarray(int[] nums) {
        int maxcount=0,count=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                count++;
            }
            while(count>1){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
            maxcount=Math.max(maxcount,right-left);
        }
        return maxcount;
    }
}