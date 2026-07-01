class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<List<Integer>> h1=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> l1=new ArrayList();
                        l1.add(nums[i]);
                        l1.add(nums[j]);
                        l1.add(nums[left]);
                        l1.add(nums[right]);
                        h1.add(l1);
                        right--;
                        left++;
                    }
                    else if(sum>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        for(var it: h1){
            ans.add(it);
        }
        return ans;
    }
}