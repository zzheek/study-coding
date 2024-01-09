import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer;

        // 행의 수가 열의 수보다 큰 경우
        if (arr.length > arr[0].length) {
            // answer 배열을 새로 생성하고 초기화
            answer = new int[arr.length][arr.length];

            // 각 행을 복사하면서 끝에 0 추가
            for (int i = 0; i < arr.length; i++) {
                answer[i] = Arrays.copyOf(arr[i], arr.length);
            }
        }
        // 열의 수가 행의 수보다 큰 경우
        else if (arr.length < arr[0].length) {
            // answer 배열을 새로 생성하고 초기화
            answer = new int[arr[0].length][arr[0].length];

            // 각 행을 복사하면서 끝에 0 추가
            for (int i = 0; i < arr.length; i++) {
                answer[i] = Arrays.copyOf(arr[i], arr[0].length);
            }
        }
        // 행의 수와 열의 수가 같은 경우
        else {
            // answer 배열에 주어진 arr을 그대로 할당
            answer = arr;
        }

        return answer;
    }
}



class Solution {
    public int[][] solution(int[][] arr) {
        if (arr.length == arr[0].length) return arr;

        int N = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[N][N];
        for (int i = 0;i < N;i++) {
            for (int j = 0;j < N;j++) {
                if (i >= arr.length || j >= arr[0].length)
                    answer[i][j] = 0;
                else 
                    answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}
