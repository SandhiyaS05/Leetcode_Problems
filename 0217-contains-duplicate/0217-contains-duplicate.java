class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h1=new HashSet<>();
        for(var it:nums){
            if(h1.contains(it)){
                return true;
            }
            h1.add(it);
        }
        return false;
    }
}