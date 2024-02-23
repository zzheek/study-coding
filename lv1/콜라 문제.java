class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n / a > 0) {
            answer += n / a * b;
            n = n / a * b + n % a;
        }
        
        return answer;
    }
}




class Solution {
    public int solution(int a, int b, int n) {
        return (n > b ? n - b : 0) / (a - b) * b;
    }
}
