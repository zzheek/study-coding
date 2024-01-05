class Solution {
    public int solution(String number) {
        int answer = 0;
        for(int i=0; i<number.length(); i++) {
            char ch = number.charAt(i);
            int digit = Character.getNumericValue(ch);
            answer += digit;
        }
        return answer%9;
    }
}




class Solution {
    public int solution(String number) {

        int sum = 0;

        for (char ch : number.toCharArray())
            sum += ch - '0';

        return sum % 9;
    }
}


