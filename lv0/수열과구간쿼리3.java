import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr,arr.length);
        
        for(int i=0 ; i<queries.length; i++){
           int temp = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = temp;
            }
        
        return answer;
    }
}




class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for(int i = 0; i < queries.length; i ++){
            int one = arr[queries[i][0]];
            int two = arr[queries[i][1]];

            //System.out.println("One: " + one + ", Two: " + two);

            arr[queries[i][0]] = two;
            arr[queries[i][1]] = one;
        }

        return arr;
    }
}




class Solution {

    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }

        return arr;
    }
}
