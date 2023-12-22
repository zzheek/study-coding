import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        int index = 0;

        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                answer[index++] = i;
            }
        }
        return Arrays.copyOf(answer, index);
    }
}




import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}
