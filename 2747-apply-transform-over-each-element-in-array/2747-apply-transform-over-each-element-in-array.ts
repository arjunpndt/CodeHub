// function map(arr: number[], fn: (n: number, i: number) => number): number[] {
// 	return arr.map((val,index)=>fn(val,index))
// };
function map(arr: number[], fn: (n: number, i: number) => number): number[] {
	return arr.map((val,index)=>fn(val,index))
};