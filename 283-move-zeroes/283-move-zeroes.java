class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]==0){
                for(int m=i;m<j;m++){
                    nums[m]=nums[m+1];
                    nums[m+1]=0; 
                }
                j--;
            } else
                i++;
        }
    }
}