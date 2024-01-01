class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i=0; i<numbers.length; i++) {
            answer += numbers[i];
            if(answer > n) {
                return answer;
            }
        }
        return answer;
    }
}




class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for(int i = 0; answer <= n; i++) {
            answer += numbers[i];
        }

        return answer;
    }
}
