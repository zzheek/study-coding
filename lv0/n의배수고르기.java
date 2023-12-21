import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[numlist.length];
        int index = 0;

        for(int i=0; i<numlist.length; i++) {
            if(numlist[i]%n == 0) {
                answer[index++] = numlist[i];
            }
        }
        return Arrays.copyOf(answer, index);
    }
}




import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numList) {
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
    }
}
