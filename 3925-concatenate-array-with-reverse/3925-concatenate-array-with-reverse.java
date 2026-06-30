class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int [] ans=new int[2*n];
        int lst=ans.length-1;
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[lst]=nums[i];
            lst--;
        }
        return ans;
    }
}