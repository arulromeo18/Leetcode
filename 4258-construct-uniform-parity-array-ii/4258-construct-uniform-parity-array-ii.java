class Solution {
    public boolean uniformArray(int[] nums1) {
       int min=Integer.MAX_VALUE;
       int flag=1;
       for(int n:nums1){
        if(n<min){
            min=n;
        }
        if(n%2==1){
            flag=0;
        }
       }
       if(flag==1){
        return true;
       }
       
       return min%2==1;
    }
}