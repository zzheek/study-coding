class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for(int i=0; i<num_str.length(); i++) {
            answer += Integer.valueOf(num_str.substring(i,i+1));
        }
        
        return answer;
    }
}




class Solution {
    public int solution(String numStr) {
        return numStr.chars().map(c -> c - 48).sum();
    }
}




class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] numArr= num_str.split("");
        for (String num : numArr){
            answer+=Integer.parseInt(num);
        }
        return answer;
    }
}
