class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        
        while(n!=0) {
            str += n%3;
            n/=3;
        }
        
        return answer = Integer.parseInt(str,3);
    }
}

