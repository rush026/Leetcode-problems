class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        func(0,candidates,target,new ArrayList<>(),ans);
        return ans;

    }
    void func(int ind,int[] candidates,int target,List<Integer> dp,List<List<Integer>> ans){
      
            if(target==0){
                ans.add(new ArrayList<>(dp));
                return;
            }
            
            for(int i = ind; i < candidates.length; i++){
            if(i>ind && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;

                dp.add(candidates[i]);
                func(i+1,candidates,target-candidates[i],dp,ans);
                dp.remove(dp.size()-1);
            
        
        
            }
    }
}