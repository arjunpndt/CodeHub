class Solution {
    public boolean isPalindrome(String s) {
         String aplhanumOnly = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i=0,j=aplhanumOnly.length()-1;
        while(i<j){
            if(aplhanumOnly.charAt(i)!=aplhanumOnly.charAt(j)) return false;
            i++;j--;
        }
        
        return true;
    }
}