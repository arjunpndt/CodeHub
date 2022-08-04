/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int str = 1,end=n;
        while(str<=end){
            int chk = (int)(str+(end-str)/2);
            if(isBadVersion(chk)) end=chk-1;
            else str=chk+1;
        }
        return str;
    }
}