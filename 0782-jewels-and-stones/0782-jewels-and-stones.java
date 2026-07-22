class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] arr=stones.toCharArray();
        int count=0;
        for(char c:arr){
            if(jewels.indexOf(c)!=-1){
                count++;
            }
        }
        return count;

    }
}