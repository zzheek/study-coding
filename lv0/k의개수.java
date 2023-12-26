class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int num=i; num<=j; num++) {
            int currentNum = num;
            while (currentNum > 0) {
                int digit = currentNum % 10;
                if (digit == k) {
                    answer++;
                }
                currentNum /= 10;
            }
        }

        return answer;
    }
}





class Solution {
    public int solution(int i, int j, int k) {
        String str = "";
        for(int a = i; a <= j; a++) {
            str += a+"";
        }

        return str.length() - str.replace(k+"", "").length();
    }
}
