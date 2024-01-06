class Solution {
    public String solution(String my_string, int s, int e) {
        char[] charArray = my_string.toCharArray();

        while (s < e) {
            char temp = charArray[s];
            charArray[s] = charArray[e];
            charArray[e] = temp;

            s++;
            e--;
        }

        return new String(charArray);
    }
}




class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
        answer.reverse();
        return my_string.substring(0, s) + answer + my_string.substring(e + 1);
    }
}
