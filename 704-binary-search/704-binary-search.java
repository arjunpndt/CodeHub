class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1,mid;
        
        return binarySearch(nums,target,low, high);
    }
    
    static int binarySearch(int[] arr, int x, int low, int high){
        int mid=0;
        if(low>high) return -1;
        mid=(low+high)/2;
        if(x==arr[mid]) return mid;
        else if(x<arr[mid]) return binarySearch(arr,x,low,mid-1);
        else return binarySearch(arr,x, mid+1,high);
        
    }
}