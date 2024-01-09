class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if(a==b && a==c && a==d){
            answer = 1111*a;
            
        }else if(a==b && a==c && a!=d){
            answer = (10*a+d)*(10*a+d);
        }else if(a==b && a==d && a!=c){
            answer = (10*a+c)*(10*a+c);
        }else if(a==c && a==d && a!=b){
            answer = (10*a+b)*(10*a+b);
        }else if(b==c && b==d && a!=b){
            answer = (10*b+a)*(10*b+a);
            
        }else if(a==b && c==d && a!=c){
            answer = (a+c) * Math.abs(a-c);
        }else if(a==c && b==d && a!=b){
            answer = (a+b) * Math.abs(a-b);
        }else if(a==d && b==c && a!=b){
            answer = (a+b) * Math.abs(a-b);
            
        }else if(a==b && a!=c && a!=d && c!=d){
            answer = c*d;
        }else if(a==c && a!=b && a!=d && b!=d){
            answer = b*d;
        }else if(a==d && a!=b && a!=c && b!=c){
            answer = b*c;
        }else if(b==c && b!=a && b!=d && a!=d){
            answer = a*d;
        }else if(b==d && b!=a && b!=c && a!=c){
            answer = a*c;
        }else if (c==d && c!=a && c!=b && a!=b){
            answer = a*b;
        }else{
            answer = Math.min(a,b);
            answer = Math.min(answer,c);
            answer = Math.min(answer,d);
        }
        return answer;
    }
}




import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {

        int[] dice = { a, b, c, d };
        Arrays.sort(dice);

        int ans = 0;

        if (dice[0] == dice[3]) {
            ans = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            ans = dice[0] * dice[1];
        } else {
            ans = dice[0];
        }

        return ans;
    }
}
