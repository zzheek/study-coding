class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i=1; i<=number; i++) {
            // 약수의 개수
            int count = 0; 
            
            for (int j=1; j*j<=i; j++) {
                if (i % j == 0) {
                    if (i / j == j) {
                        count++; // 제곱근이 약수인 경우 한 번만 카운트
                    } else {
                        count += 2; // i가 j로 나누어 떨어지면, j와 i/j는 약수이므로 카운트 2 증가
                    }
                }
            }
            
            if (count > limit) {
                // 제한수치를 초과하면 power만큼 철이 필요
                answer += power; 
            } else {
                // 초과하지 않으면 약수의 개수만큼 철이 필요
                answer += count; 
            }
        }
        return answer;
    }
}



