class Solution {
    public int removeElement(int[] nums, int val) {
        
         int k =0;
        int[] arr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                k++;
            }
        }

        for(int i =0,j=0; (i)<arr.length;){
            if(nums[j]!=(val)){
                nums[i]=nums[j];
                i++;
                if(j<arr.length-1){
                j++;}
                else if(j>=arr.length-1) {
                    break;
                }
            }
            else{
                if (j<arr.length-1) {
                    j++;    
                }
                else if(j>=arr.length-1) {
                    break;
                }
                

                
            }
        }
        // for(int i =0;i<nums.length;i++){
        //     nums[i]=arr[i];
        // }
        k=nums.length-k;
        Arrays.sort(nums,0,k);
        // for (int i = 0; i < k; i++) {
        //     System.out.println(nums[i]);
        // }
        return k;    }
}