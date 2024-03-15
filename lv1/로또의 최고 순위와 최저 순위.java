class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        // cnt1은 알아볼 수 없는 번호(0)의 개수를 카운트
        int cnt1 = 0;
        // cnt2는 구매한 로또 번호 중에서 당첨 번호와 일치하는 번호의 개수를 카운트
        int cnt2 = 0;

        for(int i : lottos) {
            if(i == 0) {
                // 번호가 0일 경우, cnt1을 증가
                cnt1++;
                continue;
            }
            // 일치하는 번호가 있는지 확인
            for(int j : win_nums) {
                if(i == j) cnt2++; // 일치하는 번호를 찾으면 cnt2를 증가
            }
        }

        // 최고 순위는 알아볼 수 없는 번호들이 모두 당첨 번호
        answer[0] = getGrade(cnt1+cnt2);
        // 최저 순위는 알아볼 수 없는 번호들이 모두 당첨 번호가 아니었다고 가정
        answer[1] = getGrade(cnt2);

        return answer;
    }

    // getGrade 메소드는 일치하는 번호의 개수를 입력받아 해당하는 순위를 반환
    public int getGrade(int n) {
        switch(n) {
            case 6 : return 1; // 6개 번호가 모두 일치할 경우 1등
            case 5 : return 2; // 5개 번호가 일치할 경우 2등
            case 4 : return 3; // 4개 번호가 일치할 경우 3등
            case 3 : return 4; // 3개 번호가 일치할 경우 4등
            case 2 : return 5; // 2개 번호가 일치할 경우 5등
            default : return 6; // 그 외의 경우는 6등(낙첨)
        }
    }
}
