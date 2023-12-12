class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] arr = my_string.split("");

          String temp = arr[num1];
          arr[num1] = arr[num2];
          arr[num2] = temp;

         return String.join("", arr);
    }
}






import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString, int num1, int num2) {
        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);
        return String.join("", list);
    }
}

