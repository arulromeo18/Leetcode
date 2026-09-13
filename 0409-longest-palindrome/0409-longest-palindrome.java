class Solution {
    public int longestPalindrome(String s) {
        int[] count=new int[52];
        for(char ch:s.toCharArray()){
            if(ch>='A'&&ch<='Z'){
                count[ch-'A']++;
            }
            else{
                count[26+(ch-'a')]++;
            }
        }
        int flag=1;
        int ans=0;
        for(int i=0;i<52;i++){
            if(count[i]%2==0){
                ans+=count[i];
            }
            else if(count[i]%2==1){
                if(flag==0){
                ans+=count[i]-1;
                }
                else{
                    ans+=count[i];
                    flag=0;
                }
            }

            }
            return ans;
        }
    }
