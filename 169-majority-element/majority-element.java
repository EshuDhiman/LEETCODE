class Solution {
    public int majorityElement(int[] nums) {
        
        int k=0;
        Arrays.sort(nums); 
        for(int i = 1; i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                if(k<nums.length/2){k++;}
            }
            if(k>((nums.length)/(float)(2))){
                break;
            }
            
        }
        
        return nums[k];
    }
}