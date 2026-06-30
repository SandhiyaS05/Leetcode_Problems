class Solution {
    public int[] rearrangeArray(int[] nums) {
        int numsLength=nums.length;
        int[] finalAns=new int[numsLength];
        int posIdx=0,negIdx=1;
        for(int i=0;i<numsLength;i++){
            if(nums[i]>0){
                finalAns[posIdx]=nums[i];
                posIdx+=2;
            }
            else{
                finalAns[negIdx]=nums[i];
                negIdx+=2;
            }
        }
        return finalAns;
    }
}