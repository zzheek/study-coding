import java.util.HashMap;
 
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<String, Integer> count = new HashMap<>();
        
        for (int i=0; i<keymap.length; i++) {
            String[] str = keymap[i].split("");
            
            for (int j=0; j<str.length; j++) {
                if (!count.containsKey(str[j])) {
                    count.put(str[j], j + 1);
                    continue;
                }
                
                if (count.get(str[j]) > j + 1) {
                    count.put(str[j], j + 1);
                }
            }
        }
        
        for (int i=0; i<targets.length; i++) {
            String[] str = targets[i].split("");
            answer[i] = 0;
            for (int j=0; j<str.length; j++) {
                if (!count.containsKey(str[j])) {
                    answer[i] = -1;
                    break;
                } else {
                    answer[i] += count.get(str[j]);   
                }
            }
        }
        
        return answer;
    }
}
