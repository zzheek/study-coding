class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("[a-zA-Z]+");
        
        for(int i=0; i<arr.length; i++){
            if(!arr[i].isEmpty()){
            answer += Integer.parseInt(arr[i]);
            }
        }
        
        return answer;
    }
}




class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }
}
