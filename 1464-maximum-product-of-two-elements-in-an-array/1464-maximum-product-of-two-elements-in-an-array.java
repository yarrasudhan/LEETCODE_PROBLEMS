class Solution {
    public int maxProduct(int[] nums) {
        int larg_1=Integer.MIN_VALUE;
        int larg_2=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>larg_1){
                larg_2=larg_1;
                larg_1=nums[i];
                
            }
            else if(nums[i]>larg_2){
                larg_2=nums[i];
            }


        }
        return (larg_1-1)*(larg_2-1);
        
        
    }
}