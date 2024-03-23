import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(c); // 여는 괄호는 스택에 push
            } else { // 닫는 괄호인 경우
                if(stack.isEmpty()) {
                    // 스택이 비어있다면, 짝이 맞지 않으므로 false 반환
                    return false;
                } else {
                    stack.pop(); // 스택에서 여는 괄호를 pop
                }
            }
        }
        
        // 모든 검사를 마친 후 스택이 비어있다면 괄호의 짝이 모두 맞는 것임
        return stack.isEmpty();
    }
}
