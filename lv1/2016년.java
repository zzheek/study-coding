public class Solution {
    public String solution(int a, int b) {
      
        // 각 월의 일수를 배열로 저장
        int[] monthDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekDays = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        // 1월 1일부터 a월 b일까지의 총 일수를 계산
        int totalDays = b;
        for (int i=1; i<a; i++) {
            totalDays += monthDays[i];
        }
        
        // totalDays - 1을 하는 이유는 1월 1일을 금요일
        String answer = weekDays[(totalDays - 1) % 7];
        
        return answer;
    }
}
