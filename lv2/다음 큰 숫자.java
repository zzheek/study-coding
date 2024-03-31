class Solution {
    public int solution(int n) {
        // n보다 1 큰 값을 시작점으로 설정
        int answer = n + 1;
        // n의 2진수 표현에서 1의 개수를 계산 하는 메소드(Integer.bitCount)
        int cnt = Integer.bitCount(n);
        
        while(true) {
            // 현재 answer의 2진수 표현에서 1의 개수를 계산
            int count = Integer.bitCount(answer);
            
            // n의 1의 개수와 현재 숫자의 1의 개수가 같으면, 반복을 종료
            if(count == cnt) {
                break;
            }
            
            // 조건을 만족하지 않으면, answer 값을 1 증가
            answer++;
        }
      
        // 조건을 만족하는 가장 작은 수 리턴
        return answer;
    }
}
