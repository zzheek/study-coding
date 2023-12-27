class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int tmp = dots[0][0];
        int tmp2 = 0;
        int tmp3 = 0;
        for(int i=1; i<dots.length; i++){
            if(dots[i][0] == tmp){
                tmp2 = Math.abs(dots[i][1] - dots[0][1]);
            }else{
                tmp3 = Math.abs(dots[i][0] - dots[0][0]);
            }
        }
        
        answer = tmp2 * tmp3;
        return answer;
    }
}





class Solution {
    public int solution(int[][] dots) {
        int x = Math.max(Math.abs(dots[0][0] - dots[1][0]),Math.abs(dots[0][0] - dots[2][0]));
        int y = Math.max(Math.abs(dots[0][1] - dots[1][1]),Math.abs(dots[0][1] - dots[2][1]));
        return x*y;
    }
}
