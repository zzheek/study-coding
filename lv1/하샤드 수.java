class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        int sum = 0;

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            sum += Character.getNumericValue(ch);
        }

        if (x % sum != 0) {
            answer = false;
        }

        return answer;
    }
}




class Solution {
    public boolean solution(int x) {
        int originalX = x;
        int digitSum = 0;

        while (x > 0) {
            digitSum += x % 10;  // 현재 자릿수를 더함
            x /= 10;             // 다음 자릿수로 이동
        }

        // 원래 수가 자릿수의 합으로 나누어지는지 확인
        return originalX % digitSum == 0;
    }
}
