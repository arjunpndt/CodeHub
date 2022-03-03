class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int[] arr = new int[nums.length];
        int k=0;
        
        for(int i=2; i<nums.length;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                arr[i]= 1+arr[i-1];
                k += arr[i];
            }
        }
        return k;
    }
}