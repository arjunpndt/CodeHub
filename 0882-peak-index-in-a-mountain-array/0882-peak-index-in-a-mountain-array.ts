function peakIndexInMountainArray(arr: number[]): number {
  let i = 0, j = arr.length - 1;
    while( i <= j ){
        let mid = Math.floor(i + (j - i)/2);
        if( arr[mid] < arr[mid + 1])i = mid + 1;
        else if( arr[mid] < arr[mid - 1])j = mid - 1;
        else return mid;
    }  
};