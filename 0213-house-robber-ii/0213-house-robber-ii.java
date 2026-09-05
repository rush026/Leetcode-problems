class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int case1=robs(nums,0,n-2);
        int case2=robs(nums,1,n-1);
        return Math.max(case1,case2);
        
    }
    int robs(int[] nums, int start, int end){
        int a=0;
        int b=0;
        for(int i=start;i<=end;i++){
            int pick=nums[i]+a;
            int notpick=b;
            int curr=Math.max(pick,notpick);
            a=b;
            b=curr;
        }
        return b;
    }
}