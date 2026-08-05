class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiopQWERTYUIOP";
        String row2="asdfghjklASDFGHJKL";
        String row3="zxcvbnmZXCVBNM";
        int count=0;
        for(int i=0;i<words.length;i++){
            int flag;
            char first=words[i].charAt(0);
            if(row1.indexOf(first)!=-1){
                flag=1;
            }
            else if(row2.indexOf(first)!=-1){
                flag=2;
            }
            else{
                flag=3;
            }
            boolean valid=true;
        
            for(int j=1;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                if(flag==1&&row1.indexOf(ch)==-1){
                    valid=false;
                    break;
                }
                if(flag==2&&row2.indexOf(ch)==-1){
                    valid=false;
                    break;
                }
                if(flag==3&&row3.indexOf(ch)==-1){
                    valid=false;
                    break;
                }
            }
           if (!valid) {
                words[i] = "-1";
            }
            else {
                count++;
            }
        }
        String[] ans=new String[count];
        int m=0;
        for(int i=0;i<words.length;i++){
            if(!words[i].equals("-1")){
                ans[m]=words[i];
                m++;
            }
        }
        return ans;
    }
}