import java.util.Arrays;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0; 
        
        // 두 배열을 오름차순으로 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        // A는 오름차순, B는 내림차순으로 하여 최소값을 만들기
        for(int i=0; i<A.length; i++){
            // A의 i번째 작은 값과 B의 i번째 큰 값을 곱하여 answer에 더함
            answer += A[i] * B[A.length-i-1];
        }

        // 모든 곱의 합이 최소가 되는 값을 반환
        return answer;
    }
}


// 가장 작은 값과 가장 큰 값을 곱하고, 그 다음으로 작은 값과 그 다음으로 큰 값을 곱하는 식
