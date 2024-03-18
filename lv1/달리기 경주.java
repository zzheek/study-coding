import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> ranking = new HashMap<>();
        
        // 각 선수의 이름과 해당하는 인덱스를 매핑
        for (int i=0; i<players.length; i++) {
            ranking.put(players[i], i);
        }

        for (String player : callings) {
            // 호출된 선수의 등수를 가져옴
            int playerRank = ranking.get(player);
            
            // 호출된 선수보다 앞에 있는 선수와 등수를 변경
            String frontPlayer = players[playerRank - 1];
            ranking.replace(frontPlayer, playerRank);
            players[playerRank] = frontPlayer;
            
            // 호출된 선수의 등수를 앞으로 변경
            ranking.replace(player, playerRank - 1);
            players[playerRank - 1] = player; 
        }
        
        return players;
    }
}

