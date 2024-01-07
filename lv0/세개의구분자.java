import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[abc]+");
        List<String> resultList = new ArrayList<>();

        for (String str : answer) {
            if (!str.isEmpty()) {
                resultList.add(str);
            }
        }

        return resultList.isEmpty() ? new String[]{"EMPTY"} : resultList.toArray(new String[0]);
    }
}




