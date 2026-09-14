class Solution {
    public String minWindow(String s, String t) {
        int[] freq=new int[128];
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int left=0,start=0,count=0;
        int minlen=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(freq[ch]>0){
                count++;
            }
            freq[ch]--;
            while(count==t.length()){
                if(right-left+1<minlen){
                    minlen=right-left+1;
                    start=left;
                }
                char leftchar=s.charAt(left);
                freq[leftchar]++;
                if(freq[leftchar]>0){
                    count--;
                }
                left++;
            }
        }
        if(minlen!=Integer.MAX_VALUE){
            return s.substring(start,start+minlen);
        }
        return "";

    }
}