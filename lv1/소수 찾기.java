class Solution {
    // n까지의 소수 개수를 반환하는 solution 함수
    public int solution(int n) {
        int answer = 0; // 소수의 개수를 저장할 변수
        
        // 2부터 n까지 모든 숫자에 대해 반복
        for (int i=2; i<=n; i++) {
            // isPrime 함수를 사용하여 i가 소수인지 판별
            if (isPrime(i)) {
                answer++; // 소수라면 answer 값을 1 증가
            }
        }
        return answer; // 최종적으로 구한 소수의 개수를 반환
    }

    // 주어진 숫자 num이 소수인지 판별하는 isPrime 함수
    private boolean isPrime(int num) {
        // 1 이하의 숫자는 소수가 아님
        if (num <= 1) {
            return false;
        }
        // 2부터 num의 제곱근까지 반복하여 나눗셈 수행
        for (int i=2; i*i<=num; i++) {
            // num이 i로 나누어떨어진다면, 즉 나누어지는 수가 있다면 소수가 아님
            if (num % i == 0) {
                return false; // 소수가 아니므로 false 반환
            }
        }
        // 위의 반복문에서 나누어떨어지는 수가 없었다면 소수임
        return true; // 소수이므로 true 반환
    }
}

