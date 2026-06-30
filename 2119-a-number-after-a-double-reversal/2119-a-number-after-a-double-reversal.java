class Solution {
    public int Reverse(int n){
        int reverse=0;
         while(n!=0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        return reverse;
    }
    public boolean isSameAfterReversals(int num) {
        int reversed=Reverse(num);
        int result=Reverse(reversed);
       return num==result;
    }
}