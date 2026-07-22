class Solution {
    public int nextGreaterElement(int n) {
        int m=n;
        String s=String.valueOf(n);
        int[] arr=new int[s.length()];
        int a=0;
        while(m!=0){
            arr[a]=m%10;
            m=m/10;
            a++;
        }
        swap(0,arr);
       int i=s.length()-2;
       while(i>=0&&arr[i]>=arr[i+1]){
        i--;
       }
       if(i>=0){
       int j=s.length()-1;
       while(j>=0&&arr[j]<=arr[i]){
        j--;
       }
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
       swap(i+1,arr);
       }
       int sum=0;
       for(int l:arr){
        sum=sum*10+l;
       }
    if (sum>n) return sum;
    else return -1;
    }
    static void swap(int start,int[] arr){
        int end=arr.length-1;
        while(start<end){
            int tempp=arr[start];
            arr[start]=arr[end];
            arr[end]=tempp;
            start++;
            end--;
        }
    }
}