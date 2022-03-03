class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int arr =0;
        int k=0;
        
        for(int i=2; i<nums.length;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                arr = 1+arr;
                k += arr;
            }
            else{
                arr=0;
            }
        }
        return k;
    }
}