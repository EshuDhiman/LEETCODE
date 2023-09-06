class Solution {
    public int findGCD(int[] nums) {
       int min = nums[0];
    int max = nums[nums.length-1];
    for (int num : nums) {
        if (num < min) {
            min = num;
        }
        if (num > max) {
            max = num;
        }
    }
    int a = min;
    int b = max;
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
    }
}