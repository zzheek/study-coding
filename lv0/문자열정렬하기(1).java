import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String abc = my_string.replaceAll("[a-z]","");
        int[] answer = new int[abc.length()];
        for(int i=0; i<abc.length(); i++) {
            answer[i] = Character.getNumericValue(abc.charAt(i));
        }
        Arrays.sort(answer);
        return answer;
    }
}





import java.util.*;

class Solution {
    public int[] solution(String myString) {
        return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
