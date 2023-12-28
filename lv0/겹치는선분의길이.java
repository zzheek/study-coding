class Solution {
    public int solution(int[][] lines) {
        int[] rail = new int[200];
        for (int[] line : lines) {
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) {
                rail[j]++;
            }
        }

        int answer = 0;
        for (int value : rail) {
            if (value > 1) answer++;
        }
        return answer;
    }
}



class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        for (int i = -100; i < 100; i++) {
            int line = 0;
            if (lines[0][0]<=i && lines[0][1]>i) line++;
            if (lines[1][0]<=i && lines[1][1]>i) line++;
            if (lines[2][0]<=i && lines[2][1]>i) line++;

            if(line > 1) answer++;
        }

        return answer;
    }
}
