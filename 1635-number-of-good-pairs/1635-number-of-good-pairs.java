class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int ans=0;
        for(Integer m:map.values()){
            ans=ans+(m*(m-1)/2);
          
        }
        return ans;
    }
}