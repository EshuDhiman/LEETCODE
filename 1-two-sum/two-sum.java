class Solution {
    public static int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        int a[] = new int[2];
        boolean isBreaked=false;
        for (int i = 0; i < nums.length ; i++) {
            if(isBreaked){
                break;
            }
            for (int k = nums.length-1; k>=i; k--) {
                if (nums[i] + nums[k] == target &&  k!=i ) {
                    a[0] = i;
                    a[1] = k;
                    isBreaked=true;
                    break;
                }

            }

        }
        
        return a;
    }

}