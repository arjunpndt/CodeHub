// function map(arr: number[], fn: (n: number, i: number) => number): number[] {
// 	return arr.map((val,index)=>fn(val,index))
// };
function map(arr: number[], fn: (n: number, i: number) => number): number[] {
    var res=[];
	for(let i =0;i<arr.length;i++){
        res[i] =fn(arr[i],i)
    }
    return res;
};