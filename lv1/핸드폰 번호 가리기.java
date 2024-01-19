class Solution {
    public String solution(String phone_number) {
        String answer = phone_number.substring(0, phone_number.length() - 4)
            .replaceAll("[0-9]", "*")
            + phone_number.substring(phone_number.length() - 4);
        return answer;
    }
}




class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }
}




class Solution {
  public String solution(String phone_number) {
    return phone_number.replaceAll(".(?=.{4})", "*");
  }
}
