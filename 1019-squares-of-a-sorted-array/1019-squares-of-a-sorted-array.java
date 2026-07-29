class Solution {
    public int[] sortedSquares(int[] nums) {
        int start=0;
        int[] arr=new int[nums.length];
        int end=nums.length-1;
        int k=end;
        while(start<=end){
            int m=nums[start]*nums[start];
            int n=nums[end]*nums[end];
            if(m>n){
                arr[k]=m;
                start++;
            }
            else{
                arr[k]=n;
                end--;
            }
            k--;
        }
        return arr;
    }
}