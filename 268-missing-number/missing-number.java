class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int p1 = 0;
        while (p1 < nums.length) {
            if (nums[p1] != p1) {
                return p1;
            }
            p1++;
        }
        // If all numbers from 0 to n-1 are in the array, return n.
        return p1;
    }
}
