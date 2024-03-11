import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 체육복을 도난당하지 않았거나, 여벌의 체육복이 없는 학생들의 수로 초기화
        int answer = n - lost.length;
        
        // lost와 reserve 배열을 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
    
        // 체육복을 도난당한 학생 중에서 여벌의 체육복을 가진 학생을 찾아 해당 학생의 체육복을 도난당했다고 표시하고, 여벌 체육복도 사용 처리함
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
            
                // 도난당한 학생이 여벌의 체육복을 가지고 있는 경우
                if(reserve[j] == lost[i]){
                    answer++; // 이 학생은 체육수업을 들을 수 있음
                    lost[i] = -1; // 도난당한 학생 목록에서 제거 (처리됨)
                    reserve[j] = -1; // 여벌 체육복 목록에서 제거 (사용됨)
                    break; // 다음 도난당한 학생을 확인
                }
            }
        }
        
        // 남은 도난당한 학생들 중에서 체육복을 빌릴 수 있는 경우를 확인
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                // 도난당한 학생이 바로 앞번호나 바로 뒷번호의 학생에게 체육복을 빌릴 수 있는 경우
                if(reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1){
                    answer++; // 이 학생도 체육수업을 들을 수 있음
                    lost[i] = -1; // 도난당한 학생 목록에서 제거 (처리됨)
                    reserve[j] = -1; // 여벌 체육복 목록에서 제거 (사용됨)
                    break; // 다음 도난당한 학생을 확인
                }
            }
        }
        
        return answer; // 체육수업을 들을 수 있는 학생의 최대 수 반환
    }
}
