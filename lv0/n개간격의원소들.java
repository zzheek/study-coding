class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int a = (int)Math.ceil((double)num_list.length/n);
        int[] answer = new int[a];
        int index = 0;
        
        for(int i=0; i<num_list.length; i+=n) {
            answer[index] = num_list[i];
            index++;
        }
        return answer;
    }
}




class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i * n];
        }
        return answer;
    }

}
