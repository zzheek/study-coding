class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string.replace(letter, "");
        return answer;
    }
}




class Solution {
    public String solution(String myString, String letter) {
        return myString.replaceAll(letter, "");
    }
}
