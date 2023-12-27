class Solution {
    public int[] solution(int[][] score) {
        float[] avg = new float[score.length];
        for(int i=0; i<score.length; i++) {
            avg[i] = (float)((score[i][0] + score[i][1]) / 2.0);
        }
        
        int[] answer = new int[score.length];
        for(int j=0; j<score.length; j++) {
            int order = 1;
            for(int k=0; k<score.length; k++) {
                if(avg[j] < avg[k]) order++;
                answer[j] = order;
            }
        }
        return answer;
    }
}
