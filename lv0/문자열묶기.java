class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        int[] leng = new int[31]; 

        for (String str : strArr) {
            int length = str.length();
            leng[length]++;
        }

        for (int num : leng) {
            answer = Math.max(answer, num);
        }

        return answer;
    }
}




