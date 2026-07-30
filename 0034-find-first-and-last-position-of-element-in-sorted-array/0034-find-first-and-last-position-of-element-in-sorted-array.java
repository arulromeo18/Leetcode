class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=firstoccurence(nums,target);
        ans[1]=lastoccurence(nums,target);
        return ans;

    }
    private int firstoccurence(int[] nums,int target){
        int index=-1;
        int low=0;
        int high=nums.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                index=mid;
                high=mid;
            }
            else if(nums[mid]>target){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return index;
    }
    private int lastoccurence(int[] nums,int target){
        int index=-1;
        int low=0;
        int high=nums.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                index=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return index;
    }
}