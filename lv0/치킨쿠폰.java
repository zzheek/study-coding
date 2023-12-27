class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while (chicken >= 10) {
            // 100/10 = 10
            int newChicken = chicken / 10;
            // 100%10 = 0
            int restChicken = chicken % 10;
            // 10+0 = 10
            chicken = newChicken + restChicken;
            // 10+1 == 11
            answer += newChicken;
        }
            
        return answer;
    }
}
