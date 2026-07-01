class Solution {
    public int[] twoSum(int[] nums, int target) {
       int [] ans=new int[2];
       HashMap<Integer,Integer> h1=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
            int diff=target-nums[i];
            var value=h1.get(diff);
            if(value!=null){
                ans[0]=value;
                ans[1]=i;
                return ans;
            }
            h1.put(nums[i],i);
       }
        return ans;
    }
}