class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] count=new int[26];
        for(char c:sentence.toCharArray()){
            count[c-'a']++;
        }
        for(int m:count){
            if(m<1){
                return false;
            }
        }
        return true;
    }
}