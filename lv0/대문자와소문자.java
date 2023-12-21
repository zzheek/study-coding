class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += c;
            }
        }

        return answer;
    }
}




import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        return myString.chars().mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());
    }
}
