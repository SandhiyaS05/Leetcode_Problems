class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int [] newarr=new int[n+m];
        int len=newarr.length;
        double ans=0;
        int mIndex=0,nIndex=0,index=0;
        while(mIndex<m&&nIndex<n){
            if(nums1[mIndex]<nums2[nIndex]){
                newarr[index]=nums1[mIndex];
                index++;
                mIndex++;
            }
            else{
                newarr[index]=nums2[nIndex];
                index++;
                nIndex++;
            }
        }
        while(mIndex<m){
            newarr[index]=nums1[mIndex];
                index++;
                mIndex++;
        }
        while(nIndex<n){
             newarr[index]=nums2[nIndex];
                index++;
                nIndex++;
        }
        if(len%2==1){
           ans=(double)newarr[len/2]; 
        }
        else{
            int t=len/2;
            ans=(double)(newarr[t]+newarr[t-1])/2;
        }
        return ans;
        
    }
}