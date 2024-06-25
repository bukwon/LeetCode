class Solution {
    public int minAddToMakeValid(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) answer ++;
                else stack.pop();
            }
        }
        return answer += stack.size();
    }
}