class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

         for(int[] rev:matrix)
         {
            int start=0,end=n-1;

            while(start<end){
                int temp=rev[start];
                rev[start]=rev[end];
               rev[end]=temp;
               start++;
               end--;
            }
         }
       
    }
}