class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        Map<Character,String> map1=new HashMap<>();
        Map<String,Character> map2=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char n=pattern.charAt(i);
            String m=arr[i];
            if(map1.containsKey(n)&&!map1.get(n).equals(m)){
                return false;
            }
            if(map2.containsKey(m)&&map2.get(m)!=n){
                return false;
            }
            map1.put(n,m);
            map2.put(m,n);
        }
        return true;
    }
}