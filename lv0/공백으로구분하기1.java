class Solution {
    public String[] solution(String my_string) {
        String[] abc = my_string.split(" ");
        String[] answer = new String[abc.length];
        for(int i=0; i<abc.length; i++) {
            answer[i] = abc[i];
        }
        return answer;
    }
}




class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
}
