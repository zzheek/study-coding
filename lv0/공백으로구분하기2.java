class Solution {
    public String[] solution(String my_string) {
        String[] str = my_string.trim().split("\\s+");
        String[] answer = new String[str.length];
        
        for(int i=0; i<str.length; i++) {
            answer[i] = str[i];
        }
        return answer;
    }
}




class Solution {
    public String[] solution(String my_string) {
        return my_string.trim().split("[ ]+");
    }
}
