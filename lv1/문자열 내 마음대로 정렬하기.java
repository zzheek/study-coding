import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        // Arrays.sort 메서드를 사용하여 strings 배열을 정렬합니다.
        // Comparator를 람다 표현식으로 구현하여 비교 기준을 정의합니다.
        Arrays.sort(strings, (s1, s2) -> {
            // 비교할 두 문자열의 인덱스 n번째 문자를 가져옵니다.
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);
            
            // 두 문자가 같은 경우, 문자열 자체를 비교하여 사전순으로 정렬합니다.
            if (c1 == c2) {
                return s1.compareTo(s2);
            } else {
                // 두 문자가 다른 경우, 해당 문자들을 비교하여 오름차순으로 정렬합니다.
                // char 타입은 ASCII 코드 값을 가지므로, 뺄셈을 통해 비교합니다.
                return c1 - c2;
            }
        });
        
        // 정렬된 strings 배열을 반환합니다.
        return strings;
    }
}
