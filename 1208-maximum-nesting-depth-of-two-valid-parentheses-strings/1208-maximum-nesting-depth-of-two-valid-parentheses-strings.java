class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] ans=new int[seq.length()];
        int depth=0;
        int i=0;
        for(char c:seq.toCharArray()){
            if(c=='('){
                depth++;
                if(depth%2==1){
                    ans[i]=0;
                }
                else{
                    ans[i]=1;
                }
            }
            else{
                depth--;
                if(depth%2==0){
                    ans[i]=0;
                }
                else{
                    ans[i]=1;
                }
            }
            i++;
            

        }
        return ans;
    }
}