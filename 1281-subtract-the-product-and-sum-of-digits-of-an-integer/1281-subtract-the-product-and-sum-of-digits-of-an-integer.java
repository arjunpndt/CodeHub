class Solution {
    public int subtractProductAndSum(int n) {
        int summ = 0, prod =1,k;
        while(n!=0){
            k=n%10;
            n=n/10;
            summ+=k;
            prod*=k;
        }
        return prod-summ;
    }
}