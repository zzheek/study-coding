class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int cnt = 0;

        for (int num : arr) {
            boolean isUnique = true;

            for (int i = 0; i < cnt; i++) {
                if (answer[i] == num) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                answer[cnt] = num;
                cnt++;

                if (cnt == k) {
                    break;
                }
            }
        }

        for (int i = cnt; i < k; i++) {
            answer[i] = -1;
        }

        return answer;
    }
}





