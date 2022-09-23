class Solution {
    public int sumOfUnique(int[] nums) {
        int res=0;
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> rep = new HashSet<Integer>();
        for(int i: nums){
            if(set.contains(i))
                rep.add(i);
            set.add(i);
        }
        for(int i:nums){
            if(!rep.contains(i))
                res+=i;
        }
        return res;
    }
}