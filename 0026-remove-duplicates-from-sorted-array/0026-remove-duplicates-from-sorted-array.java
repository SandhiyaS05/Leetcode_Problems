class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int []expectedNums=new int[nums.length];
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                expectedNums[index]=nums[i];
                index++;
            }
        }
        for(int i=1;i<expectedNums.length;i++){
            nums[i]=expectedNums[i];
        }
        return index;
    }
}