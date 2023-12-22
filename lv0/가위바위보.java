class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(int i = 0; i<rsp.length(); i++){
            if(rsp.charAt(i) == '2'){
                answer += '0' ;
            }else if(rsp.charAt(i) == '0'){
                answer += '5';
            }else if(rsp.charAt(i) == '5'){
                answer += '2';
            }
        }
        
        return answer;
    }
}





import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
    }
}
