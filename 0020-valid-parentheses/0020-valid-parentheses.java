class Solution {
    public boolean check(char a,char b){
        if(a=='(' && b==')' || a=='[' && b==']' || a=='{' && b=='}'){
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top =stack.pop();
                if(!check(top,c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}