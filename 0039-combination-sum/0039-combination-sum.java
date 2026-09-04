class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans=new ArrayList<>();
        func(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    void func(int ind,int[] candidates, int target, List<Integer> dp,List<List<Integer>> ans){
        if(ind==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(dp));
            }
            return;
        }
            if(candidates[ind]<=target){
                dp.add(candidates[ind]);
               func(ind,candidates,target-candidates[ind],dp,ans);
               dp.remove(dp.size()-1);
            }
            func(ind+1,candidates,target,dp,ans);
        

    }
}