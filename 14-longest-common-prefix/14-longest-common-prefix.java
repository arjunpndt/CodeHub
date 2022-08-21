class Solution {
   public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 1) return strs[0];
        
        String first = strs[0];
        int idx = 0;
        
        for (int i = 0; i < first.length(); i++) {
            
            boolean isEqual = true;
            int position  = i;
            char letter = first.charAt(position);
            
            for (int j = 1; j < strs.length; j++) {
                
                String comp = strs[j];
                
                if (i >= comp.length()) {
                    
                    isEqual = false;
                    break;
                }
                char compLetter = comp.charAt(i);
                
                if (compLetter != letter) {
                    
                    isEqual = false;
                    break;
                }
            }
            
            if (!isEqual) break;
            else idx ++;
        }
        
        return first.substring(0, idx);
}
}