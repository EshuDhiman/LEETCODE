class Solution {
   public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m + n];
        for (int i = 0; i < m; i++) {
            if (nums1[i] != 0) {
                arr[i] = nums1[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums2[i] != 0) {
                arr[m + i] = nums2[i];
            }
        }
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
            nums1[i]=arr[i];
        }
        // for (int i = 0; i < nums1.length; i++) {
        //     System.out.print(nums1[i]+",");
        // }
    }
}