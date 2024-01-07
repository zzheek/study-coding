class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] codeArray = code.split(""); 
        
        for(int i=0; i<codeArray.length; i++) {
            if(i%q ==r) {
                answer += codeArray[i];
            }
        }
        
        return answer;
    }
}




class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";

        for(int i = 0; i < code.length(); i ++){

            if(i % q == r){
                answer += code.charAt(i);
            }
        }

        return answer;
    }
}
