class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int answer = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("Z")){
                answer -= Integer.parseInt(arr[i-1]);
                continue;
            }
            answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}




import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}
