import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 귤의 크기별로 개수를 저장할 맵 생성
        Map<Integer, Integer> map = new HashMap<>();

        // 각 귤의 크기별로 개수 세기
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // 귤의 크기를 리스트로 변환
        List<Integer> keyList = new ArrayList<>(map.keySet());
        // 귤의 크기별로 가장 많이 수확된 순으로 정렬. 내림차
        keyList.sort(((o1, o2) -> map.get(o2) - map.get(o1)));
        
        int answer = 0; 
        // 귤의 크기가 많은 순으로 순회
        for (Integer i : keyList) {
            // 필요한 k개의 귤을 모두 선택했으면 반복 종료
            if (k <= 0) {
                break;
            }

            answer++; // 서로 다른 귤의 크기 종류 하나 추가
            k -= map.get(i); // 선택된 귤의 개수만큼 k에서 빼기
        }

        return answer;
    }
}

