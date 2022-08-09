class Solution {
    public int lengthOfLongestSubstring(String str) {
        if(str.equals("")) return 0;
        int ans = Integer.MIN_VALUE;
        int cnt = 0;
        
        LinkedList<Character> list = new LinkedList();
        
        for(char ch : str.toCharArray()){
            if(!list.contains(ch)){
                list.add(ch);
                cnt++;
                ans = Math.max(ans,cnt);
            }
            else{
            while(!list.isEmpty() && list.contains(ch)){
                list.removeFirst();
                cnt--;
            }
            list.add(ch);
                cnt++;
            }
        }
        
        return ans;
    }
}