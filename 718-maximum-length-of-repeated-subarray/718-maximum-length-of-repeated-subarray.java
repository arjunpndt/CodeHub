class Solution {
  public int findLength(int[] A, int[] B) {
        
        int maxLen = 0;
        
        
        for (int j = 0; j < B.length; j++) {
            int maxLenEnding = 0;
            for (int i = 0, k = j; i < A.length && k < B.length; i++, k++) {
                if (A[i] != B[k]) maxLenEnding = 0;
                else {
                    maxLenEnding++;
                    maxLen = Math.max(maxLen, maxLenEnding);
                }
            }
        }
        
        for (int i =1; i < A.length; i++) {
            int maxLenEnding = 0;
            for (int j = 0, k = i; k < A.length && j < B.length; j++, k++) {
                if (A[k] != B[j]) maxLenEnding = 0;
                else {
                    maxLenEnding++;
                    maxLen = Math.max(maxLen, maxLenEnding);
                }
            }
        }
        
        return maxLen;
        
        
        
    }
}