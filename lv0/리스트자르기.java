import java.util.Arrays;

class Solution {
    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
      
        int[] answer;

        switch (n) {
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, b + 1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, a, num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, a, b + 1);
                break;
            case 4:
                int count = (b - a) / c + 1;
                answer = new int[count];
                for (int i = 0; i < count; i++) {
                    answer[i] = num_list[a + i * c];
                }
                break;
            default:
                answer = new int[0]; 
                break;
        }

        return answer;
    }
}




class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;
        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
}
