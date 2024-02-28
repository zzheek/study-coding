import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i=0; i<answers.length; i++) {
            if (answers[i] == one[i % one.length]) answer[0]++;
            if (answers[i] == two[i % two.length]) answer[1]++;
            if (answers[i] == three[i % three.length]) answer[2]++;
        }
        
        int maxScore = Math.max(answer[0], Math.max(answer[1], answer[2]));
        
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<3; i++) {
            if (maxScore == answer[i]) {
                list.add(i + 1);
            }
        }
        
        // list를 int[]로 변환
        int[] result = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}

