class Solution {
    public String reverseWords(String s) {
        int k=0,m=0;
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' ){
                if(k==0){
                    res = res+""+reverse(s,k,i-1);
                k=i+1;
                } else{
                    res = res+" "+reverse(s,k,i-1);
                k=i+1;
                }
                
            }
            if(i==s.length()-1){
                if(k==0)
                    res = res+""+reverse(s,k,i);
                else
                    res = res+" "+reverse(s,k,i);
            }
                
        }
        return res;
        
    }
    public String reverse(String s,int k,int j){
        String res="";
        for(int i=j;i>=k;i--){
            res = res+s.charAt(i);
        }
        return res;
    }
}