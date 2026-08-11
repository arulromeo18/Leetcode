class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count=new int[101];
        for(int n:nums){
            count[n]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
          
                ans[i]=count[nums[i]-1];
            }
        }
        return ans;
    }
}