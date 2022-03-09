class Solution {
    public int arraySign(int[] nums) {
        int x=1,k=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0)
                x=0;
            else if(nums[i]<1)
                k+=1;
        }
        if(x==0)
            x=0;
        else if(k%2==0)
            x=1;
        else
            x=-1;
        return x;
    }
}