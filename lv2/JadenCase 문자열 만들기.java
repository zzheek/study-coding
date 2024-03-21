public class Solution {
    public String solution(String s) {
        String answer = ""; 
        String[] arr = s.split(" "); // 문자열을 공백을 기준으로 나눠서 배열에 저장

        // 각 단어에 대해 JadenCase로 변환
        for(int i = 0; i < arr.length; i++) {
            // 단어가 공백인 경우 공백을 answer에 추가
            if(arr[i].length() == 0) {
                answer += " ";
            } else {
                // 첫 글자를 대문자로 변환 후, 나머지 글자는 소문자로 변환하여 answer에 추가
                answer += arr[i].substring(0, 1).toUpperCase();
                answer += arr[i].substring(1).toLowerCase();
                answer += " ";
            }
        }
    
        // 입력 문자열이 마지막에 공백으로 끝나는 경우에는 그대로 반환
        if(s.substring(s.length() - 1, s.length()).equals(" ")) {
            return answer;
        } 
        
        // 마지막 공백을 제거한 결과 반환
        return answer = answer.substring(0, answer.length() - 1);
    }
}



// 다른 사람의 풀이
class Solution {
  public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
  }
}
