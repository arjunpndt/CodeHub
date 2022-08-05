class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(nums.length<4) return nums;
        boolean flag= true;
        int[] res = new int[nums.length];
        for(int i=0,j=0;i<nums.length;i++){
            if(flag)
                res[i]=nums[j];
            if(!flag)
                res[i]=nums[(n)+j++];
            flag = !flag;
        }
        return res;
    }
}