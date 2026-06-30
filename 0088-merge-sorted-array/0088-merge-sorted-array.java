class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] nums3=new int[m+n];
        int nums1Index=0,nums2Index=0,nums3Index=0;
        while(nums1Index<m&&nums2Index<n){
           if(nums1[nums1Index]>nums2[nums2Index]){
            nums3[nums3Index]=nums2[nums2Index];
            nums2Index++;
            nums3Index++;
           }
           else{
            nums3[nums3Index]=nums1[nums1Index];
            nums1Index++;
            nums3Index++;
           }
        }
        while(nums1Index<m){
            nums3[nums3Index]=nums1[nums1Index];
            nums1Index++;
            nums3Index++;
        }
        while(nums2Index<n){
            nums3[nums3Index]=nums2[nums2Index];
            nums2Index++;
            nums3Index++;
        }
        for(int i=0;i<m+n;i++){
            nums1[i]=nums3[i];
        }
    }
}