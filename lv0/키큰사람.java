class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i]>height) {
                answer ++;
            }
        }
        return answer;
    }
}




class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i: array){
            answer += (i>height) ? 1 : 0;
        }
        return answer;
    }
}




import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(value -> value > height).count();
    }
}
