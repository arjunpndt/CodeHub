class Solution {
    public int lengthOfLastWord(String s) {
        int count =0,i=0,max=0;
        boolean check = true;
        while(i<s.length()){
            if(s.charAt(i)==' '){
                count=0;
            }
            else{
                count++;
            }
            if(count>0)
                max=count;
                
            i++;
        }
        return max;
    }
}