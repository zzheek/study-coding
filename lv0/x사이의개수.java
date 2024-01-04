class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x", myString.length());
        int[] answer = new int[str.length];
        for(int i=0; i<answer.length; i++) {
            answer[i] = str[i].length();
        }
        return answer;
    }
}




import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {

        return Arrays.stream(myString.split("x", myString.length()))
            .mapToInt(x -> x.length())
            .toArray();
    }
}
