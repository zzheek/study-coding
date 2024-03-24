class Solution {
    public int solution(int n) {
        int answer = 0; 
        
        for (int start=1; start<=n; start++) {
            int sum = 0; // start부터 시작하는 연속된 자연수의 합을 저장할 변수
            
            // 시작점인 start부터 n까지의 수를 차례대로 더해보면서 n과 같은지 확인
            for (int num=start; num<=n; num++) {
                sum += num; // 현재 숫자를 sum에 더합니다.
                
                if (sum == n) {
                    // 만약 연속된 수의 합이 n과 같다면,
                    // 방법의 수를 하나 증가시키고 내부 반복문을 탈출
                    answer++; 
                    break; 
                } else if (sum > n) {
                    // 만약 연속된 수의 합이 n을 초과한다면,
                    // 더 이상 확인할 필요가 없으므로 내부 반복문을 탈출
                    break; 
                }
            }
        }
        
        return answer;
    }
}
