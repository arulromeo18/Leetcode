class Solution {
    public int maxArea(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int max=Integer.MIN_VALUE;
        int area=1;
        while(start<end){
            
            if(nums[start]>nums[end]){
                area=nums[end]*(end-start);
                end--;
            }
            else{
                area=nums[start]*(end-start);
                start++;
            }
            if(max<area) max=area;
        }
        return max;
    }
}