import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n); 
        
        for(int i=0; i<str.length(); i++){
            answer += Integer.parseInt(str.substring(i, i+1));
        }
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
