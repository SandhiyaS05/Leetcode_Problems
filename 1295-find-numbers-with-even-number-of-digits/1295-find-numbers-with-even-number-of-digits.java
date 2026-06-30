class Solution {
    public int findNumbers(int[] nums) {
        int digit=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i],count=0;
            while(n!=0){
                count++;
                n=n/10;
            }
            if(count%2==0)
                digit++;
            count=0;
        }
        return digit;
    }
}