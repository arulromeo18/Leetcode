class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        for(int n=0;n<nums.length;n++){
            if(!set.contains(n)){
                return n;
            }
        }
    return nums.length;
    }
}