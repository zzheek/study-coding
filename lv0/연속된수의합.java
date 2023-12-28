class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        // (12/3) - ((3-1)/2) 4 - 1 = 3
        // 3 - 2 = 1
        int start = (total/num) - ((num - 1)/2);
        
        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }
        
        return answer;
    }
}
