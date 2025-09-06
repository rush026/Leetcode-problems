class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
       HashMap<Character,String> h=new HashMap<>();
       for(int i=0;i<pattern.length();i++){
        char ch=pattern.charAt(i);
        boolean containkey=h.containsKey(ch);
        if(!containkey && h.containsValue(arr[i])){
            return false;
        }
        if(containkey && !h.get(ch).equals(arr[i])){
            return false;
        }
            h.put(ch,arr[i]);
        
       }
       return true;

    }
}