class Solution {
    public boolean isPalindrome(int x) {
        int t=x,result=0;
        while(t!=0){
            int digit=t%10;
            t=t/10;
            result=(result*10)+digit;
        }
        if(result!=x||x<0){
            return false;
        }
        else{
            return true;
        }
    }
}