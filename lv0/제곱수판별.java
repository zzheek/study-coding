class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            if(n == (i*i)) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}





class Solution {
    public int solution(int n) {
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
