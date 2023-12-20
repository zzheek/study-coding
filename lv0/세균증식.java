class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for(int i=1; i<=t; i++) {
            answer *= 2; 
        }  
        return answer;
    }
}





import java.util.*;

class Solution {
    public int solution(int n, int t) {
        int answer = 1;

        answer = n * (int)Math.pow(2, t);

        return answer;
    }
}
