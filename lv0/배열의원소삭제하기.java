import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int[] deleteList) {
        List<Integer> result = new ArrayList<>();

        for (int element : arr) {
            boolean shouldDelete = false;
            for (int deleteElement : deleteList) {
                if (element == deleteElement) {
                    shouldDelete = true;
                    break;
                }
            }

            if (!shouldDelete) {
                result.add(element);
            }
        }

        // ArrayList를 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}




import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();
    }
}
