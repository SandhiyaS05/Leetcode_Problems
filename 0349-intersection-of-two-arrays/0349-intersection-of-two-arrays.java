class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        for(var it:nums1){
            h1.add(it);
        }
        for(var it:nums2){
            if(h1.contains(it)){
                result.add(it);
            }
        }
        int [] ans=new int [result.size()];
        int i=0;
        for(var it:result){
            ans[i]=it;
            i++;
        }
        return ans;
    }
}