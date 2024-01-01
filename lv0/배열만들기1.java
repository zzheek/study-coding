class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int index = 0;
        for(int i=1; i<=n; i++) {
            if(i%k == 0) answer[index++] = i;
        }
        return answer;
    }
}




import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray();
    }
}
