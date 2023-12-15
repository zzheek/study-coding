class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0; 
        int count [] = new int[1000+1]; 
        
        for(int i=0; i<array.length; i++) {  
            count[array[i]]++;
            if(max < count[array[i]]) {     
                max = count[array[i]];
                answer = array[i];
            }
        }
        
        int temp = 0;  
        for(int j=0; j<1001; j++) {
            if(max == count[j])
                temp ++;
            if (temp > 1)
                answer = -1;
        }
        return answer;
    }
}




import java.util.*;
class Solution {
    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}
