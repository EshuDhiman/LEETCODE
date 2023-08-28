class Solution {
    public int majorityElement(int[] nums) {
        
        int k=0;
        Arrays.sort(nums); 
        for(int i = 1; i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                // here we used jab tk k ki vlaue array ke half size se choti h tb tk usko increment kro vrna jab k ki value increase ho gai half of the array size se to increment na kro is se hoga kya agr kuch cases me elements ki jo freq hai wo jda hai to kai baar cases me sahi postion na return krte hue uske ek aage ki value return kr rha tha to mene ye conditon lga di
                if(k<nums.length/2){k++;}
            }
            // 
            if(k>((nums.length)/(float)(2))){
                break;
            }
            
        }
        
        return nums[k];
    }
}