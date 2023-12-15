class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int j = 0;
        answer = (n%2 == 0)? new int[n/2] : new int[n/2+1];
        for(int i=0; i<=n; i++) {
            if(i%2 == 1) {
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
}


import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}
