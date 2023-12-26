class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(int i=0; i<keyinput.length; i++) {
            if(keyinput[i].equals("left")) answer[0]--;
            else if(keyinput[i].equals("right")) answer[0]++;
            else if(keyinput[i].equals("up")) answer[1]++;
            else if(keyinput[i].equals("down")) answer[1]--;
            
            if (answer[0] > Math.floor(board[0]/2)) {
                answer[0] = (int) Math.floor(board[0]/2);
            }else if(answer[0]<-Math.floor(board[0]/2)){
                answer[0] = -(int) Math.floor(board[0]/2);
            }
            if (answer[1] > Math.floor(board[1]/2)) {
                answer[1] = (int) Math.floor(board[1] / 2);
            }else if(answer[1]< -Math.floor(board[1]/2)){
                answer[1] = -(int) Math.floor(board[1]/2);
            }
        }


        return answer;
    }
}
