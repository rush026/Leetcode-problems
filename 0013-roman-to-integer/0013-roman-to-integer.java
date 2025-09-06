class Solution {
    public int romanToInt(String s) {
      HashMap<Character,Integer> r=new HashMap<>();
      r.put('I',1);
      r.put('V',5);
      r.put('X',10);
      r.put('L',50);
      r.put('C',100);
      r.put('D',500);
      r.put('M',1000);
      int result=r.get(s.charAt(s.length()-1));
      for(int i=s.length()-2;i>=0;i--){
        if(r.get(s.charAt(i))<r.get(s.charAt(i+1))){
        result=result-r.get(s.charAt(i));}
        else{
            result=result+r.get(s.charAt(i)); 
        }

      }
      return result;

    }
}