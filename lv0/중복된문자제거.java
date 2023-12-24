class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0 ; i<my_string.length(); i++){
            //indexOf () 해당 문자의 첫번째 위치를 리턴
            //charAt() 해당 위치의 문자를 리턴
            //해당 위치의 문자의 위치가 i랑 같으면 answer에 담음
            if(my_string.indexOf(my_string.charAt(i)) == i){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}




import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

        return String.join("", set);
    }
}
