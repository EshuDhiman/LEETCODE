class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        
        int[] newArr = new int[nums1.length + nums2.length];
        
        for (int i = 0; i < nums1.length; i++) {
            newArr[i]=nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            newArr[nums1.length+j]=nums2[j];
        }
        Arrays.sort(newArr);
         if (newArr.length % 2 == 0) {
            median = ((newArr[(newArr.length / 2)-1] + (float)(newArr[(newArr.length / 2) ])) / 2);
        } 
        else{
            median = newArr[newArr.length/2];
        }
                return median;
    }
}