class Solution {
    public void reverseString(char[] s) {
      int i=0,j=s.length-1;
        while(i<j){
            char kk=s[i];
            s[i]=s[j];
            s[j]=kk;
            i++;j--;
        }
    }
}