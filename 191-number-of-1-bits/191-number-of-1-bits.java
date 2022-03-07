public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count =0;
        String sb=Integer.toBinaryString(n);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1') count++;
        }
         return count;   
    }
}