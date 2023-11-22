class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        for(int i=0; i<arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}



class Solution {
    public String solution(String[] arr) {
        return String.join("", arr);
    }
}


// arr[] =["a","b","c"]	
// abc로 출력
