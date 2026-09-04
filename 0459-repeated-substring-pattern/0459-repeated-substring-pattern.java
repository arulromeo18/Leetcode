class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        int[] lps=new int[s.length()];
        int len=0;
        int i=1;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else if(len>0){
                len=lps[len-1];
            }
            else{
                i++;
            }
        }
        int patternlength=n-lps[n-1];
        return lps[n-1]>0&&n%patternlength==0;
        //String t=s+s;
        //return t.substring(1,t.length()-1).contains(s);
        // for(int i=0;i<s.length()/2;i++){
        //     int start=0;
        //     int end=i+1;
        //     String t=s.substring(start,end);
        //     while(end<=s.length()&&t.equals(s.substring(start,end))){
        //         start=end;
        //         end=start+i+1;
        //     }
        //     if(start==s.length()){
        //         return true;
        //     }
        // }
        // return false;
    }
}