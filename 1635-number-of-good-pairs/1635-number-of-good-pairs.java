class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int ans=0;
        for(int n:nums){
            int m=map.get(n);
            ans=ans+(m*(m-1)/2);
            map.put(n,0);
        }
        return ans;
    }
}