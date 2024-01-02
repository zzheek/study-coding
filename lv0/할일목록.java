class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int length = 0;
        for(int i=0; i<finished.length; i++) {
            if(finished[i] == false) {
                length++;
            }
        }
        String[] answer = new String[length];
        int index = 0;
        for(int i=0; i<todo_list.length; i++) {
            if(finished[i] == false) {
                answer[index++] = todo_list[i];
            }
        }
        return answer;
    }
}




class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String str = "";
        for(int i=0; i<finished.length; i++){
            str = finished[i]==false ? str+todo_list[i]+"," : str;
        }

        return str.split(",");
    }
}
