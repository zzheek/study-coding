class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) (((ch - base + n) % 26) + base);
            }
            
            answer.append(ch);
        }

        return answer.toString();
    }
}



