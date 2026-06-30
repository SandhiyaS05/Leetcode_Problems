class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=2;i<=num;i++){
            if(i>9){
                int ans=0;
                int n=i;
                while(n!=0){
                    int digit=n%10;
                    n=n/10;
                    ans+=digit;
                }
                if(ans%2==0){
                    count++;
                }
            }
            else if(i%2==0){
                count++;
            }
        }
        return count;
    }
}