class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==digitsum(nums[i])){
                return i;
            }
        }
        return -1;
    }
    static int digitsum(int m){
        int sum=0;
        while(m!=0){
            sum+=(m%10);
            m/=10;
        }
        return sum;
    }
}