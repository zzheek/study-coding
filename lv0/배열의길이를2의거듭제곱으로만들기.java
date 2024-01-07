class Solution {
    public int[] solution(int[] arr) {
        int org = arr.length;
        int zero = 1;

        while (zero < org) {
            zero *= 2;
        }

        int[] answer = new int[zero];

        for (int i=0; i<org; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}




import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }
}
