class Solution {
  public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String str : array) {
            cnt = str.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? str.toLowerCase() : str.toUpperCase(); 
        }
      
      return answer;
  }
}




class Solution {
  public String solution(String s) {
        char[] chars = s.toCharArray();
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                idx = 0;
            else
                chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
        }

        return String.valueOf(chars);
  }
}
