class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> h1=new HashSet<>();
        int ans=0;
        for(int it: nums){
            if(h1.contains(it)){
                ans=it;
                return it;
            }
            h1.add(it);
        }
        return ans;
    }
}