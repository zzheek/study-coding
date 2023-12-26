class Solution {
    public long solution(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long answer = solution(balls - 1, share - 1);
        answer *= balls;
        answer /= share;

        return answer;
    }

}
