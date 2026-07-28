class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long k=n*m;
        long sn1=k*(k+1)/2;
        long sn2=(k*(k+1)*(2*k+1))/6;
        long s1=0,s2=0;
        for(int i=0;i<grid.length;i++){
                 for(int j=0;j<m;j++){
                    s1+=grid[i][j];
                    s2+=grid[i][j]*grid[i][j];
                 }
            
        }
             long s=s1-sn1;
             long s0=s2-sn2;
              s0=s0/s;
             long x=(int)((s0+s)/2);
             long y=(int)(x-s);
             return new int[]{(int)x,(int)y};

    }
}