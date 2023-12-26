class Solution {
    public int solution(int[] array, int n) {
        // 배열의 첫 번째 원소를 초기값으로 설정
        int answer = array[0];
      
        // 현재까지 찾은 가장 가까운 차이를 저장하는 변수
        int min = Integer.MAX_VALUE; 
        for (int i=0; i<array.length; i++) {
             // 배열을 순회하면서 가장 가까운 수 찾기
            int abs = Math.abs(array[i]-n);
          
            // 현재 차이가 기존 최소 차이보다 작거나,
            // 현재 차이가 기존 최소 차이와 같지만 현재 원소가 더 작으면 업데이트
            if(min > abs || (min == abs && array[i] < answer)){
                min = abs;
                answer = array[i];
            }
            
        }
        
        return answer;
    }
}




import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 1 ; i < array.length ; i++){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }
}
