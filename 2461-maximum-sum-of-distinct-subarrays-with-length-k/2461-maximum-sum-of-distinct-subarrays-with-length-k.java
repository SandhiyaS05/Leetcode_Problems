class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        long sum=0,maxsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
            if(i>=k){
                int elementToRemove=nums[i-k];
                sum-=elementToRemove;
                h1.put(elementToRemove,h1.get(elementToRemove)-1);
                if(h1.get(elementToRemove)==0){
                    h1.remove(elementToRemove);
                }
            }
            if(i>=k-1 && h1.size()==k){
                maxsum=Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }
}