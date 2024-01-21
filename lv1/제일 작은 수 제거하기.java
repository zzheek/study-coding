import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        // 주어진 배열의 길이가 1 이하인 경우, 빈 배열이 아닌 경우 배열을 그대로 반환
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        // 배열에서 최솟값을 찾기
        int min = Arrays.stream(arr).min().getAsInt();

        // 최솟값을 제외한 배열 생성
        int[] answer = Arrays.stream(arr).filter(num -> num != min).toArray();

        return answer;
    }
}
