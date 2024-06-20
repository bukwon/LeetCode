class Solution {
    public int minFlips(String target) {
        int answer = 0;
        char check = '0';
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != check) {
                answer ++;
                check = target.charAt(i);
            }
        }
        return answer;
    }
}