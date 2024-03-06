import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 각 스테이지별 도달했지만 클리어하지 못한 플레이어 수를 저장할 배열
        int[] players = new int[N+2]; 
        // 각 스테이지에 도달한 플레이어 수를 저장할 배열 (이번 코드에서는 사용되지 않음)
        int[] reach = new int[N+2]; 
        // 각 스테이지별 실패율을 저장할 배열
        double[] failureRates = new double[N]; 

        // stages 배열을 순회하여 각 스테이지별 도달했지만 클리어하지 못한 플레이어 수를 계산
        for (int stage : stages) {
            players[stage]++;
        }

        // 전체 플레이어 수
        int totalPlayers = stages.length; 

        // 각 스테이지별 실패율을 계산
        for (int i = 1; i <= N; i++) {
            // 현재 스테이지에 도달한 플레이어가 없는 경우 실패율은 0
            if (totalPlayers == 0) {
                failureRates[i-1] = 0; 
            } else {
                // 현재 스테이지의 실패율 계산
                failureRates[i-1] = (double) players[i] / totalPlayers; 
                // 다음 스테이지의 계산을 위해 현재 스테이지의 플레이어 수를 전체 플레이어 수에서 차감
                totalPlayers -= players[i]; 
            }
            // 이 부분은 현재 로직에서 사용되지 않습니다. 도달한 플레이어 수를 누적하는 로직이나, 결과에 영향을 주지 않음
            reach[i+1] = players[i] + reach[i]; 
        }

        // 실패율이 높은 스테이지부터 정렬하기 위한 배열
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            int maxIndex = 0;
            // 실패율이 가장 높은 스테이지를 찾음
            for (int j = 1; j < N; j++) {
                if (failureRates[j] > failureRates[maxIndex]) {
                    maxIndex = j;
                }
            }
            // 실패율이 가장 높은 스테이지를 결과 배열에 저장
            answer[i] = maxIndex + 1;
            // 찾은 스테이지의 실패율을 -1로 설정하여 다음 검색에서 제외
            failureRates[maxIndex] = -1; 
        }

        return answer;
    }
}
