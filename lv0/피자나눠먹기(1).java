class Solution {
    public int solution(int n) {
        int answer = (int)Math.ceil((double)n/7);
        
        
        return answer;
    }
}




class Solution {
    public int solution(int n) {
        return (n + 6) / 7;
    }
}




class Solution {
    public int solution(int n) {
        int answer = (n%7==0) ? n/7 : n/7 + 1;

        return answer;
    }
}
