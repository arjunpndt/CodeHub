class Solution {
    public int arraySign(int[] nums) {
        int x=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            else if(nums[i]<1)
                x+=1;
        }
        if(x%2==0)
            x=1;
        else
            x=-1;
        return x;
    }
}