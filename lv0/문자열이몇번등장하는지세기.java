class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patLeng = pat.length();
        
        for(int i=0; i<=myString.length()-pat.length(); i++) {
            if(myString.substring(i,patLeng).contains(pat)) {
                answer++; 
            }
            patLeng++;
        }    
        
        return answer;
    }
}




class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.substring(i).startsWith(pat)){
                cnt++;
            }
        }
        return cnt;
    }
}
