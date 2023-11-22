class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        
        int ab1 = Integer.valueOf(ab);
        int ba1 = Integer.valueOf(ba);

        if(ab1>ba1) {
            answer = ab1;
        } else if(ba1>ab1) {
            answer = ba1;
        } else {
            answer = ab1;
        }
        
        return answer;
    }
}



class Solution {
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
    }
}
