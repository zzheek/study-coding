class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // Math.sqrt(x) : 정수 제곱근
        double sqrt = Math.sqrt(n);
        
        // Math.pow(x, y) : x를 y만큼 곱함
        if(sqrt % 1 == 0) {
            answer = (long) Math.pow(sqrt + 1, 2);
        }
        else answer = -1;
        
        return answer;
    }
}




