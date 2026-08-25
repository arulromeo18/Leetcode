class Solution {
    public int missingMultiple(int[] nums, int k) {
        int count[] =new int[101];
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int n:nums){
            if(n%k==0){
                count[n]++;
            }
            if(max<n){
                max=n;
            }
            if(min>n){
                min=n;
            }
        }
        
        int end=max-(max%k);
        for(int i=k;i<=end;i+=k){
            if(count[i]==0){
                return i;
            }
        }
        return end+k;
    }
}