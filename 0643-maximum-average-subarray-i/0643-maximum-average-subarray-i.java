class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len=nums.length;
        double maxSum=Integer.MIN_VALUE;
        int sum=0,i;
        for(i=0;i<k;i++){
            sum=sum+nums[i];
        }
        double avg=(double)sum/k;
        maxSum=Math.max(maxSum,avg);
        for(i=k;i<len;i++){
            sum=sum+nums[i]-nums[i-k];
            avg=(double)sum/k;
            maxSum=Math.max(maxSum,avg);
        }
        return maxSum;
    }
}