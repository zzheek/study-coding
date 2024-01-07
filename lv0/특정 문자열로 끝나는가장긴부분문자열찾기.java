class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int num = myString.lastIndexOf(pat);
      
        if(myString.contains(pat)) {
            answer = myString.substring(0,num+pat.length());
        }
        
        return answer;
    }
}




class Solution {
    public String solution(String myString, String pat) { 
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}
