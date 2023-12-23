class Solution {
    public String solution(int age) {
        String answer = "";
        
        while (age > 0) {
            int digit = age % 10;
            char ch = (char) ('a' + digit);
            answer = ch + answer;
            age /= 10;
        }
        
        return answer;
    }
}