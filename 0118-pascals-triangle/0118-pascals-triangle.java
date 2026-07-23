class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> result=new ArrayList<>();
         if(numRows==0) return result;
         ArrayList<Integer> f1=new ArrayList<>();
         f1.add(1);
         result.add(f1);
         if(numRows==1) return result;
         for(int i=1;i<numRows;i++){
            List<Integer> pre=result.get(i-1);
            ArrayList<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=0;j<i-1;j++){
                row.add(pre.get(j)+pre.get(j+1));
            }
            row.add(1);
            result.add(row);

         }
         return result;

         }
     
    }
