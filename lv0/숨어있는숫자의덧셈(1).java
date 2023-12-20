class Solution {
    public int solution(String my_string) {
        int answer = 0;

         for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                answer += Character.getNumericValue(ch);
            }
        }

        return answer;
    }
}



import java.util.stream.IntStream;

class Solution {
    public int solution(String my_string) {
        return my_string.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
    }
}
