class Solution {
    public int pivotIndex(int[] nums) {
        int len=nums.length,leftsum=0,rightsum=0;
        for(int i=0;i<len;i++){
            rightsum+=nums[i];
        }
        for(int i=0;i<len;i++){
            rightsum-=nums[i];
            if(leftsum==rightsum) return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}