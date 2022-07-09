class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0, nums.length-1);
    }
    static int binarySearch(int[] arr, int x, int low, int high){
        if(low>high) return -1;
        if(x==arr[(low+high)/2]) return (low+high)/2;
        else if(x<arr[(low+high)/2]) return binarySearch(arr,x,low,(low+high)/2-1);
        else return binarySearch(arr,x, (low+high)/2+1,high);
        
    }
}