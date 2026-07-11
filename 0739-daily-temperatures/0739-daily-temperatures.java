class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length,index=n-1;
        int[] ans = new int[n];
        Stack<Integer> s1=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s1.isEmpty()&&temperatures[i]>=temperatures[s1.peek()]){
                s1.pop();
            }
            int topElement=s1.isEmpty()==true?0:Math.abs(i-s1.peek());
            ans[index--]=topElement;
            s1.push(i);
        }
        return ans;
    }
}