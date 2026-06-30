class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        int []ans=new int[len];
        int index=0;
        for(int i=len-k;i<len;i++){
            ans[index]=nums[i];
            index++;
        }
        for(int i=0;i<len-k;i++){
            ans[index]=nums[i];
            index++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}