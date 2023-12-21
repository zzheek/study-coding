class Solution {
    public String solution(String my_string) {
        
        String answer = "";
        my_string = my_string.replace("a","");
        my_string = my_string.replace("e","");
        my_string = my_string.replace("i","");
        my_string = my_string.replace("o","");
        my_string = my_string.replace("u","");
        
        return answer=my_string;
    }
}



class Solution {
    public String solution(String my_string) {
        String answer = "";

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
}


  
class Solution {
    public String solution(String myString) {
        return myString.replaceAll("a|e|i|o|u", "");
    }
}
