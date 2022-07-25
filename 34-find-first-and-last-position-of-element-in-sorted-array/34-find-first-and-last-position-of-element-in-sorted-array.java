class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        boolean check =true;
         for(int i=0;i<nums.length;i++){
             if(nums[i]==target && check){
                 arr[0]=i;
                 arr[1]=i;
                 check=false;
             }
             if(check==false && nums[i]==target)
                 arr[1]=i;
                 
         }
        return arr;
    }
}