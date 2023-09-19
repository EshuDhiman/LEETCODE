class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Ensure k is within the array size
    
        reverse(nums, 0, n - 1); // Reverse the entire array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, n - 1); // Reverse the remaining elements
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
