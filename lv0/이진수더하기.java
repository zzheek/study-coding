class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";

        // 2진수 -> 10진수 
        int n = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);

        // 10진수 -> 2진수
        answer = Integer.toBinaryString(n);
        
        return answer;
    }
}
