import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sumSet = new HashSet<>(); 
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]); 
            }
        }

        List<Integer> sumList = new ArrayList<>(sumSet);
        Collections.sort(sumList); 
        
        int[] answer = new int[sumList.size()];
        for (int i=0; i<sumList.size(); i++) {
            answer[i] = sumList.get(i);
        }
        
        return answer;
    }
}
