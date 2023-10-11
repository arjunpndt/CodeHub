
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ht = new HashMap<Integer, Integer>();
        int[] res =  new int[2];
        for(int i=0;i<nums.length;i++){
            if(ht.containsKey(target-nums[i])){
                res[1]=i;
                res[0]=ht.get(target-nums[i]);
                return res;
            }
            ht.put(nums[i],i);
        }
        return res;
    }
}
