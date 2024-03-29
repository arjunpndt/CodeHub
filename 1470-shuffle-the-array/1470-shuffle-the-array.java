class Solution {
    public int[] shuffle(int[] nums, int n) {
        boolean flag= true;
        int[] res = new int[2*n];
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