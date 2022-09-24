/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    return fibo(n);
};
var fibo =function(n){
    if(n<2)
        return n;
    return fibo(n-1)+fibo(n-2);
}
