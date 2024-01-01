class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0;

        for (int i=n; i<num_list.length; i++) {
            answer[index++] = num_list[i];
        }

        for (int i=0; i<n; i++) {
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}




class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        for (int i=0;i<num_list.length;i++){
            if (n == num_list.length) {
                n = 0;
            }
            answer[i] = num_list[n];
            n++;
        }
        return answer;
    }
}




import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList, int n) {
        int[] copy = Arrays.copyOf(numList, numList.length * 2);

        System.arraycopy(numList, 0, copy, numList.length, numList.length);
        return Arrays.copyOfRange(copy, n, n + numList.length);
    }
}
