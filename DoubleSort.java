import java.util.Arrays;

public class DoubleSort {
    public static void main(String[] args) {
        int [] nums1 = {1,3};
        int [] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x=nums1.length+nums2.length;
        double [] merge = new double [x];
        int n1=0,n2=0;
        for (int i=0;i<x;i++){
            if (n1==nums1.length){
                merge[i]=nums2[n2++];
                continue;
            }
            if (n2==nums2.length){
                merge[i]=nums1[n1++];
                continue;
            }
            if (nums1[n1]<nums2[n2]){
                merge[i]=nums1[n1++];
            }
            else {
                merge[i]=nums2[n2++];
            }
        }
        System.out.println(Arrays.toString(merge));
        System.out.println(x);
        if (x%2!=0) return merge[(x/2)];
        double h = merge[x/2]+merge[(x/2)-1];
        return h/2;
    }
    
}
