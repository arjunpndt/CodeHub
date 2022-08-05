class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for(int i=0, j=n, idx=0; idx<2*n; i++, j++) {
            arr[idx++] = nums[i];
            arr[idx++] = nums[j];
        }
        return arr;
    }
}