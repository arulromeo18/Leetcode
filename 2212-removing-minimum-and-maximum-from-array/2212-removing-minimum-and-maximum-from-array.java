class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                start=i;
            }
            if(nums[i]<min){
                min=nums[i];
                end=i;
            }
        }
        int min1=Math.min(start,end);
        int max1=Math.max(start,end);
        int a=max1+1;
        int b=min1+(nums.length-max1)+1;
        int c=nums.length-min1;
        return Math.min(a,Math.min(b,c));
    }
}