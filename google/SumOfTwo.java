
package google;
class SumOfTwo
{
    public static int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        for(int i=0; i < n-1 ;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums [i] + nums[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};// return a;
    }
    public static void main(String[] args) {
         int arr[] = new int[5];//initialize 
         arr = new int[]{10,20,40,50,60};
         for(int a : arr)
         {
            System.out.println(a);
         }
        int[] op = new int[2];
        op = twoSum(arr, 30);
        System.out.println(op[0]);
        System.out.println(op[1]);
        
    }
}