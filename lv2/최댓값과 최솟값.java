public class Solution {
    public String solution(String s) {
        // 주어진 문자열을 공백을 기준으로 분리하여 숫자들을 배열에 저장
        String[] numbers = s.split(" ");
        
        // 최소값과 최대값을 저장할 변수 초기화
        int min = Integer.MAX_VALUE; // 가장 큰 정수값으로 초기화
        int max = Integer.MIN_VALUE; // 가장 작은 정수값으로 초기화
        
        // 배열을 반복하여 최소값과 최대값 찾기
        for (String number : numbers) {
            // 문자열을 정수로 변환
            int num = Integer.parseInt(number);
            // 현재 값이 최소값보다 작으면 최소값 갱신
            min = Math.min(min, num);
            // 현재 값이 최대값보다 크면 최대값 갱신
            max = Math.max(max, num);
        }
        
        // 최소값과 최대값을 문자열로 반환
        return min + " " + max;
    }
}

