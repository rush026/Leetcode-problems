class Solution {
    public double myPow(double x, int n) {
        if(x==1) return 1.00; 
        double result=1.0;
        long n1=n;
        if(n1<0){
            x=1/x;
            n1=-n1;
        }
        while(n1>0){
            if(n1%2==1){
                result*=x;
                n1=n1-1;}
            else if(n1%2==0){
                x*=x;
                n1=n1/2;
            }
        }
        
        
        
        
       
    
     

        return result;

}
}