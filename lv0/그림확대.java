class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];

        for (int i=0; i <answer.length; i++) {
            answer[i] = "";

            // 현재 행을 원본 그림의 (i / k) 번째 행으로 설정
            for (int j=0; j<picture[0].length(); j++) {
                char ch = picture[i / k].charAt(j);
                answer[i] += String.valueOf(ch).repeat(k);
            }
        }

        return answer;
    }
}
