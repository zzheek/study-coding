class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String a = my_string.substring(0,s);
        String answer = a + overwrite_string + my_string.substring(s + overwrite_string.length()); 
        
        return answer;
    }
}

// 제한사항
my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이

// 입출력 예 #1
예제 1번의 my_string에서 인덱스 2부터 overwrite_string의 길이만큼에 해당하는 부분은 "11oWor1"이고 이를 "lloWorl"로 바꾼 "HelloWorld"를 return 합니다.
