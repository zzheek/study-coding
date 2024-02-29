import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // 점수 배열을 오름차순 정렬

        // 점수 배열의 끝부터 m개씩 묶어서 가장 큰 점수를 선택하여 계산
        for(int i=score.length; i>=m; i-=m){
            // m개씩 묶은 그룹에서 가장 큰 점수를 선택하여 k번 곱한 후 answer++
            answer += m * score[i - m];
        }
        return answer;
    }
}
