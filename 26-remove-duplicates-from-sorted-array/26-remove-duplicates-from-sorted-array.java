class Solution {
    public int removeDuplicates(int[] nums) {
        int k=nums[0],j=1;
        for(int i= 1;i<nums.length;i++){
            if(nums[i]!=k){
                k=nums[i];
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}