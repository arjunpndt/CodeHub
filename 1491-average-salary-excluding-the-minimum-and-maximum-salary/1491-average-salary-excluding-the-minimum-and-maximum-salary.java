class Solution {
    public double average(int[] salary) {
       double sum=0;
        Arrays.sort(salary);
        for(int i=0;i<salary.length;i++){
            if(i!=0 && i!=salary.length-1){
                sum+=salary[i];
            }
        }
        return sum/(salary.length-2);
    }
}