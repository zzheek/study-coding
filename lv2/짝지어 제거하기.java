import java.util.Stack;

class Solution {
    public int solution(String s) {
        // 문자를 저장하기 위한 스택을 생성
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            // 현재 문자를 ch 변수에 저장
            char ch = s.charAt(i);
            
            // 스택이 비어있지 않고, 스택의 맨 위에 있는 문자가 현재 문자와 같은 경우
            if(!stack.isEmpty() && stack.peek() == ch) {
                // 같은 문자를 스택에서 제거 (짝지어 제거하기 조건 충족)
                stack.pop();
            } else {
                // 스택이 비어있거나 맨 위의 문자가 현재 문자와 다를 경우, 현재 문자를 스택에 추가
                stack.push(ch);
            }
        }

        // 모든 문자를 확인한 후 스택이 비어있다면 모든 문자가 짝지어 제거되었다는 뜻이므로 1을 
        // 스택에 문자가 남아있다면 짝지어 제거하기를 완성하지 못했다는 의미이므로 0을 반환
        return stack.isEmpty() ? 1 : 0;
    }
}
