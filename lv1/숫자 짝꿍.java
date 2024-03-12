class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder(); // 결과를 저장할 StringBuilder 객체 생성
        int[] x = new int[10]; // X 문자열에 각 숫자가 몇 번 나오는지 저장할 배열
        int[] y = new int[10]; // Y 문자열에 각 숫자가 몇 번 나오는지 저장할 배열
        
        // X 문자열을 순회하면서 각 숫자의 등장 횟수를 x 배열에 기록
        for(int i=0; i<X.length(); i++) {
            x[X.charAt(i) - '0']++;
        }
        
        // Y 문자열을 순회하면서 각 숫자의 등장 횟수를 y 배열에 기록
        for(int i=0; i<Y.length(); i++) {
            y[Y.charAt(i) - '0']++;
        }
        
        // 가장 큰 수를 만들기 위해 9부터 0까지 역순으로 숫자를 확인
        for(int i=9; i>=0; i--) {
            // X와 Y에서 숫자 i가 나온 횟수 중 더 작은 값을 기준으로 반복
            for(int j=0; j<Math.min(x[i], y[i]); j++) {
                answer.append(i); // 공통된 숫자를 결과에 추가
            }
        }
        
        // 결과 문자열이 비어있다면 공통된 숫자가 없으므로 "-1" 반환
        if(answer.length() == 0) return "-1";
        // 결과의 첫 번째 문자가 '0'이라면 두 수의 짝꿍은 0임을 의미하므로 "0" 반환
        if(answer.charAt(0) == '0') return "0";
        
        // 위 조건에 해당하지 않는 경우, 만들어진 짝꿍 숫자를 문자열 형태로 반환
        return answer.toString();
    }
}
