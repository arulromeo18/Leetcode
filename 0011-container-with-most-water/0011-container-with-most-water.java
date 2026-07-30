class Solution {
    public int maxArea(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int max=Integer.MIN_VALUE;
        while(start<end){
            int min=Math.min(nums[start],nums[end]);
            int area=min*(end-start);
            max=Math.max(max,area);
            if(nums[start]>nums[end]){
                end--;
            }
            else{
                start++;
            }
        }
        return max;
    }
}