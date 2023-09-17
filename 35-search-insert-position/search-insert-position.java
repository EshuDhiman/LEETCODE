class Solution {
    public int searchInsert(int[] nums, int target) {
        int p1=0;
        int p2 = nums.length-1;
        while(p1<p2 && nums[p1]<target && nums[p2]<target ){
            if(nums[p1]==target){
                return p1;
            }
            else if(nums[p2]==target){
                return p2;
            }
            else{
                p1++;
                p2--;
                
            }

        }
        p1=0;
        while(p1<nums.length && nums[p1]<target){
            p1++;
        }
        return p1;
    }
}