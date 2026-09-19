class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='#'){
                stack.push(c);
            }
            else{
                if(!stack.isEmpty())
                { stack.pop();
                }
            }
        }
        Stack<Character> stack2=new Stack<>();
        for(char d:t.toCharArray()){
            if(d!='#'){
                stack2.push(d);
            }
            else{
                if(!stack2.isEmpty()){
                stack2.pop();
            }
            }
        }
        while(!stack.isEmpty()&&!stack2.isEmpty()){
            char c=stack.pop();
            char d=stack2.pop();
            if(c!=d){
                return false;
            }
        }
        return stack.isEmpty()&&stack2.isEmpty();
    }
}