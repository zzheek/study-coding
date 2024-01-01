class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a%2==1 && b%2==1) {
            answer = (a*a) + (b*b);
        } else if(a%2==0 && b%2==0) {
            answer = (a > b) ? a-b : b-a;
        } else {
            answer = 2 * (a+b);
        }
        return answer;
    }
}




class Solution {
    public int solution(int a, int b) {
        if(a%2==1 && b%2==1) {
            return (a*a)+(b*b);
        }
        else if(a%2==1 || b%2==1) {
            return 2*(a+b);
        }

        return Math.abs(a-b);
    }
}
