class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++) {
            String[] abc = quiz[i].split(" ");
            int result = Integer.parseInt(abc[0]) + ( Integer.parseInt(abc[2]) * ( abc[1].equals("+") ? 1:-1) );
            answer[i] = result == Integer.parseInt(abc[4])? "O": "X";
        }
        
        return answer;
    }
}




import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        return Arrays.stream(quiz).map(s -> {
            String[] arr = s.trim().split(" ");
            return arr[1].equals("+") && Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) || Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) ? "O" : "X";
        }).toArray(String[]::new);
    }
}
