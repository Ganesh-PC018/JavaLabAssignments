class Sum_truck
{
    public int maxSum(int n) 
    { 
        //code here.
        // int sum =0;
        int r = helper(n,0,0);
        return r;
    } 
    
    public static int helper(int n,float sum,float prev)
    {

        // if(sum == prev)
        // {
        //     return sum;
        // }
        // sum =0;
        // prev =0;
        sum  += n/2.0f;
        sum  += n/3.0f;
        sum  +=  n/4.0f;
        sum = (int)sum;
        prev += sum/2.0f;
        prev += sum/3.0f;
        prev += sum/4.0f;
        
        // return helper(prev,sum,prev);
        return (int)prev;
        
    }

    public static void main(String[] args) {
        Sum_truck l = new Sum_truck();
       System.out.println( l.maxSum(11));
    }
}