class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(i==0 || (i!=0 && nums[i]!=nums[i-1])){
            int j=i+1,k=len-1,sum = -nums[i];
            while(j<k){
               if (nums[j] + nums[k] == sum) {
                      res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while(j<k && nums[j] == nums[j + 1]) j++;
                        while(j<k && nums[k] == nums[k - 1]) k--;

                        j++; k--;
                    }
                else if((nums[j]+nums[k])<sum)
                    j++;
                else
                    k--;
            }
            }
                        
        }
        return res;
                        
    }
}