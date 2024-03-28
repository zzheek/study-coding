import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;        
        int length = s.length(); // 입력 문자열의 길이를 저장
        
        // 회전된 문자열을 구하는 반복문
        for (int i = 0; i < length; i++) {
            Stack<Character> stack = new Stack<>(); // 스택을 생성하여 괄호를 저장
            boolean isValid = true; // 현재 회전된 문자열이 올바른 괄호 문자열인지 여부를 나타내는 변수
            
            // 현재 회전된 문자열을 순회하며 괄호 문자열의 유효성 검사
            for (int j = 0; j < length; j++) {
                char c = s.charAt((j + i) % length); // 회전된 위치에 해당하는 문자를 가져옴
                
                // 여는 괄호일 경우 스택에 추가
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else { // 닫는 괄호일 경우
                    if (stack.isEmpty()) { // 스택이 비어있으면 올바른 괄호 문자열이 아님
                        isValid = false;
                        break;
                    }
                    
                    char top = stack.pop(); // 스택에서 가장 위의 괄호를 꺼냄
                    // 닫는 괄호와 스택에서 꺼낸 괄호가 짝이 맞지 않으면 올바른 괄호 문자열이 아님
                    if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                        isValid = false;
                        break;
                    }
                }
            }
            
            // 유효성 검사를 통과하고 스택이 비어있으면 올바른 괄호 문자열로 인정
            if (isValid && stack.isEmpty()) {
                answer++; // 올바른 괄호 문자열의 개수를 증가
            }
        }
        
        return answer;
    }
}
