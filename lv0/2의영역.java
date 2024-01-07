class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        boolean two = false;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                if (!two) {
                    two = true;
                    start = i;
                }
                end = i;
            }
        }

        if (start == -1) {
            return new int[]{-1};
        }

        int[] answer = new int[end-start+1];
        for (int i=start; i<=end; i++) {
            answer[i-start] = arr[i];
        }

        return answer;
    }
}




