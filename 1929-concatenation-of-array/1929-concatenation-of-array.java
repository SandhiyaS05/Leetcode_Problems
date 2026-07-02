class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans=new int[2*nums.length];
        int index=0,mid=nums.length;
        for(int i=0;i<nums.length;i++){
            ans[index]=nums[i];
            index++;
            ans[mid]=nums[i];
            mid++;
        }
        return ans;
    }
}