class Solution {
   
    public static boolean isValid(String s) {
        Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();
        int len = charArr.length;

        for (int i = 0; i < len; i++) {
            if (stack.isEmpty()) {
                if(map.values().contains(charArr[i]))
                    return false;
                else
                    stack.push(charArr[i]);
            } else {
                char lastInserted = stack.peek();
                if (map.containsKey(lastInserted) && charArr[i] == map.get(lastInserted))
                    stack.pop();
                else
                    stack.push(charArr[i]);
            }
        }

        return stack.isEmpty();
    }

}