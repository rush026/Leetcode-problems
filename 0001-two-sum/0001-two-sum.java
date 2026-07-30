class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rest=target-nums[i];
            if(res.containsKey(rest)){
                return new int[]{res.get(rest),i};

            }
            res.put(nums[i],i);
        }
        return new int[]{};
    }
}