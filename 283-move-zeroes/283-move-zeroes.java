class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            {
                count++;
            }
            else{
                nums[j]=nums[i];
                j++;
            }
        }
        for(int i=j;i<j+count;i++){
            nums[i] = 0;
        }
    }
}