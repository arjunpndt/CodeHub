import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss =s.toCharArray(),tt=t.toCharArray();
        Arrays.sort(ss);Arrays.sort(tt);
        String ssSort= new String(ss);
        String ttSort= new String(tt);
       
        return ssSort.equals(ttSort);
    }
}