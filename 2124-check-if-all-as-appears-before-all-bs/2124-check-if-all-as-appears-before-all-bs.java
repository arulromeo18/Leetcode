class Solution {
    public boolean checkString(String s) {
        boolean ans=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                ans=false;
            }
            if(!ans){
                if(s.charAt(i)=='a'){
                    return false;
                }
            }
        }
        return true;
    }
}