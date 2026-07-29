import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        
       Hashtable<Integer,Integer> res=new Hashtable<>();
       for(int num:nums){
        res.put(num,res.getOrDefault(num,0)+1);
        if(res.get(num)>nums.length/2) return num;
        
       }
       return -1;
    }
}