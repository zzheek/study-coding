import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // 출력할 문자열 배열 선언
        String[] answer = new String[n];
        
        // 각 배열의 원소를 처리하여 비밀지도를 해독
        for (int i = 0; i < n; i++) {
            // arr1과 arr2의 각 원소를 비트 OR 연산하여 이진수로 변환하여 저장
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            // 이진수를 n자리로 맞추기 위해 포맷팅 (공백으로 채움)
            answer[i] = String.format("%" + n + "s", answer[i]);
            // 이진수에서 1은 벽(#)으로, 0은 공백( )으로 변환하여 저장
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
        }
        
        return answer;
    }
}
