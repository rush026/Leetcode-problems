class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> res=new HashMap<>();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            res.put(nums[i],res.getOrDefault(nums[i],0)+1);
            if(res.get(nums[i])>nums.length/3) {
                if(arr.contains(nums[i])){
                    continue;
                }
                else{
                arr.add(nums[i]);
                }

            }
        }
        return arr;
    }
}