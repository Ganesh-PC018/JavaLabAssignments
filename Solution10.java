class Solution10{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        for (int i=0;Math.pow(2,i)<=n;i++)
         
        if(Math.pow(2,i)==n){

            return true;
        }
    
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Solution10.isPowerofTwo(128));
    }
    
}