class Solution {
    int FindFirstIndex(int [] arr,int target){
        int low =0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                if(mid==0||arr[mid]!=arr[mid-1]){
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
       }
       return -1;

    }
    int FindLasttIndex(int [] arr,int target){
        int low =0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                if(mid==arr.length-1||arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else{
                    low=mid+1;
                }
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
       }
       return -1;

    }
    public int[] searchRange(int[] nums, int target) {
        int [] pos=new int[2];
        int start,end;       
        start=FindFirstIndex(nums,target);
        end=FindLasttIndex(nums,target);
        pos[0]=start;
        pos[1]=end;
        return pos;
    }
}