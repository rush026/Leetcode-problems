class Solution {
    public boolean isMatch(String s, String p) {
         Boolean[][] dp = new Boolean[s.length()][p.length()];
        return solve(s,p,s.length()-1,p.length()-1,dp);
    }
    public boolean solve(String s,String p,int i,int j,Boolean[][] dp){
        if(i<0 && j<0){
            return true;
        }if(i>=0 && j<0){
            return false;
        }if(i<0 && j>=0){
            for(int k=0;k<=j;k++){
                if(p.charAt(k) != '*'){
                    return false;
                }
                
            }return true;
        }
        if (dp[i][j] != null) return dp[i][j];

        boolean ans;
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            ans= solve(s,p,i-1,j-1,dp);
        }else if(p.charAt(j)=='*'){
            ans=(solve(s,p,i-1,j,dp) || solve(s,p,i,j-1,dp));
        }
         else{ans=false;}
         dp[i][j] = ans;
        return ans;
    }
}