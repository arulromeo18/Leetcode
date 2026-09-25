class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for(String c:s){
            if(c.equals("C")){
                int n=stack.pop();
                sum-=n;
            }
            else if(c.equals("D")){
                int n=stack.peek();
                stack.push(n*2);
                sum+=(n*2);
            }
            else if(c.equals("+")){
                int n=stack.pop();
                int m=stack.peek();
                stack.push(n);
                stack.push(n+m);
                sum+=(n+m);
            }
            else{
                int n=Integer.valueOf(c);
                stack.push(n);
                sum+=n;
            }
        }
        return sum;
        
    }
}