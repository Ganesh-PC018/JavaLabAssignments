package google;
import java.util.*;
class MedainOfSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int l3 = l1+l2;
        // int arr[] = new int[l3];
        // int j=0;
        int[] arraymerge = new int[l1+l2];
        System.arraycopy(nums1, 0, arraymerge, 0, l1);
        System.arraycopy(nums2, 0, arraymerge, l1, l2);
       
        Arrays.sort(arraymerge);
       
        double median;
        if(l3%2 == 0)
        {
            int m = l3/2-1;
            int n = m+1;
            median =(double)(arraymerge[m] +arraymerge[n])/2.0;

        }
        else
        {
            int m = l3/2;
            median = arraymerge[m];
        }
        return median;
    }
    public static void main(String[] args) {
        int nums[] = new int[]{10,20,3,2,5,20};
        int num2[] = new int[]{20,3,9,19,23};
        MedainOfSortedArray o1 = new MedainOfSortedArray();
        double f = o1.findMedianSortedArrays(nums, num2);
        System.out.println(f);

    }
}

