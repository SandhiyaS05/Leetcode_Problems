class Solution {
    public int SumOfNums(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
                sum+=i;
            }
            return sum;
    }
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            int fst=0,lst=0;
            fst=SumOfNums(1,i);
            lst=SumOfNums(i,n);
            if(fst==lst){
                return i;
            }
        }

        return -1;
    }
}