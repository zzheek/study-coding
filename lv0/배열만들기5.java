import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = new int[intStrs.length];
        for(int i=0; i<answer.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(num > k) {
                answer[i] = num;
            } 
        }
        return Arrays.stream(answer).filter(value -> value != 0).toArray();
    }
}




import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {

        ArrayList<Integer> list = new ArrayList<>();

        for (String myStr : intStrs) {
            int num = Integer.parseInt(myStr.substring(s, s + l));
            if (k < num)
                list.add(num);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
