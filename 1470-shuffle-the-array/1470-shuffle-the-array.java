class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(nums.length<4) return nums;
        boolean flag= true;
        int j=0;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(flag==true){
                res[i]=nums[j];
                
            }
            if(flag==false){
                res[i]=nums[(nums.length/2)+j++];
               
            }
            flag = !flag;
        }
        return res;
    }
}