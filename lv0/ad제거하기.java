import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        
        for (String str : strArr) {
            if (!str.contains("ad")) {
                answer.add(str);
            }
        }
        return answer.toArray(new String[0]);
    }
}




import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(s -> !s.contains("ad")).toArray(String[]::new);
    }
}
