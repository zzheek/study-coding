class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length; i++) {
            String str = String.valueOf(array[i]);
            String[] arr = str.split("");
            
            for(int j=0; j<arr.length; j++) {
                answer = arr[j].equals("7") ? ++answer : answer;
            }
        }
        
        return answer;
    }
}




import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        return (int) Arrays.stream(
                        Arrays.stream(array)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining())
                                .split("")
                )
                .filter(s -> s.equals("7"))
                .count();
    }
}
