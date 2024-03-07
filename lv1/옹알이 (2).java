class Solution {
    public int solution(String[] babbling) {
        String[] patterns = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String word : babbling) {
            boolean isValid = true;
            String tempWord = word;

            for (int i=0; i<patterns.length; i++) {
                // 해당 발음이 연속해서 나타나는 경우를 체크
                String doublePattern = patterns[i] + patterns[i];
                if (tempWord.contains(doublePattern)) {
                    isValid = false;
                    break;
                }
            }

            // 각 발음을 순서대로 처리
            for (String pattern : patterns) {
                tempWord = tempWord.replaceAll(pattern, " "); // 발음을 공백으로 치환
            }
            tempWord = tempWord.trim(); // 공백 제거

            // 유효한 발음만으로 구성되어 있는지 확인
            if (!tempWord.isEmpty()) {
                isValid = false;
            }

            if (isValid) {
                answer++;
            }
        }

        return answer;
    }
}




class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String str:babbling){
            if(str.contains("ayaaya") || str.contains("yeye") || str.contains("woowoo") || str.contains("mama"))
                continue;
            if(str.replace("aya", "1").replace("ye", "1").replace("woo", "1").replace("ma", "1").replace("1", "").length() == 0)
                answer++;
        }
        return answer;
    }
}
