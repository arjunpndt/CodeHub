class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0,countF=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<pref.length();j++){
                if(pref.length()<=words[i].length()){
                if(pref.charAt(j)==words[i].charAt(j)) count++; 
                }
            }
            if(count==pref.length()) countF++;
            count=0;
        }
        return countF;
    }
}