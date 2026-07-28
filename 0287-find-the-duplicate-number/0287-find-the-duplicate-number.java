class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> res=new HashSet<>();
        for(int num:nums){
            
            if(res.contains(num)){
                return num;
            }
            res.add(num);
        }
        return -1;
    }
}