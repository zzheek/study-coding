class Solution {
    public int solution(int slice, int n) {
        int answer = (int)Math.ceil((double)n/slice);
        return answer;
    }
}




class Solution {
    public int solution(int slice, int n) {
        return n % slice > 0 ? n/slice+1 : n/slice;
    }
}
