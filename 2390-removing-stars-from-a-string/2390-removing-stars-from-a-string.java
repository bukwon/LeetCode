class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '*') stack.pop();
            else stack.add(c);
        }
        String tmp = "";
        for (char c: stack) {
            tmp += c;
        }
        return tmp;
    }
}