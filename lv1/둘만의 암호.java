class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for(int i=0; i<s.length(); i++) {
            // 현재 문자를 가져옴
            char ch = s.charAt(i);
            // index만큼 뒤의 알파벳으로 변경하는 작업
            for(int j=0; j<index; j++) {
                // 알파벳을 하나 증가시킴
                ch += 1;
                // 만약 알파벳이 'z'를 넘어가면 'a'로 돌아가야 하므로 26을 빼줌
                if (ch > 'z') {
                    ch -= 26;
                }
                // 만약 증가된 알파벳이 skip 문자열에 포함되어 있다면, 
                // 이번 증가는 세지 않음 (index만큼 제대로 증가시키기 위해 j를 감소시킴)
                if (skip.contains(String.valueOf(ch))) {
                    j--;
                }
            }
            // 최종적으로 변환된 문자를 결과 문자열에 추가
            answer += ch;
        }
        return answer;
    }
}


