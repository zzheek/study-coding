class Solution {
    public String solution(int[] food) {
        // 결과 문자열을 초기화합니다.
        String answer = "0";
        
        // 배열의 끝부터 시작하여 탐색합니다.
        for (int i=food.length-1; i>0; i--) {
            // food[i]의 값의 절반만큼 반복합니다.
            for (int j=0; j<food[i]/2; j++) {
                // 결과 문자열에 i를 추가합니다.
                // 이어서 answer가 뒤에 붙습니다.
                // 예를 들어, i가 3이고 answer가 "0"이면 "303"이 됩니다.
                answer = i + answer + i; 
            }
        }

        // 완성된 결과 문자열을 반환합니다.
        return answer;
    }
}



