class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> h1=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                    int sum=nums[i]+nums[start]+nums[end];
                if(sum==0){
                    List<Integer> l1=new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[start]);
                    l1.add(nums[end]);
                    h1.add(l1);
                    int startNumber=nums[start];
                    int endNumber=nums[end];
                    while(start<end&&nums[start]==startNumber)
                    {
                        start++;
                    }
                    while(start<end&&nums[end]==endNumber)
                    {
                        end--;
                    }
                }
                else if(sum>0){
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        for(var it:h1){
            ans.add(it);
        }
        return ans;
    }
}