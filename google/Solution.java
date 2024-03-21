package google;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int l3 = l1+l2;
        int arr[] = new int[l3];
        int j=0;
        for(int i=0;i<l1;i++)
        {
            arr[j] = nums1[i];
            j++;
        }
        for(int i=0;i<l2;i++)
        {
            arr[j] = nums2[i];
            j++;
        }
       
        for(int i=0;i<j;i++)
        {
            for(int k=0;k<j-i-1;k++)
            {
                if(arr[k] > arr[k+1])
                {
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        for(int a : arr)
        {
            System.out.println(a);
        }
        int median;
        if(j%2 == 0)
        {
            int m = j/2-1;
            int n = m+1;
            median = (arr[m] +arr[n])/2;

        }
        else
        {
            int m = j/2;
            median = arr[m];
        }
        return median;
    }
    public static void main(String[] args) {
        int nums[] = new int[]{10,20,3,2,5,20};
        int num2[] = new int[]{20,3,9,19,23};
        Solution o1 = new Solution();
        double f = o1.findMedianSortedArrays(nums, num2);
        System.out.println(f);

    }
}

