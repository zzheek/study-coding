import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 명단을 해시맵에 이름과 등장 횟수로 저장
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        // 완주한 선수를 해시맵에서 뺌
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }
        
        // 등장 횟수가 1인 선수를 찾아서 반환
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }
        
        // 완주하지 못한 선수가 없으면 null 반환
        return null;
    }
}
