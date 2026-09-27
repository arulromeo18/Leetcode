class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> stack=new Stack<>();

        char[] arr = s.toCharArray();
        int i=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(i+1);
            }
            else if(c==')'){
                int n=stack.pop();
                reverse(arr,n,i);
            }
            i++;
        }
        String str=new String(arr);
        str=str.replaceAll("[(|)]","");
        return str;
    }
    private static void reverse(char[] arr,int start,int end){
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}