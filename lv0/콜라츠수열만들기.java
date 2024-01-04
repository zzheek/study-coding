class Solution {
    public int[] solution(int n) {
        String str = n + " ";
        while(n!=1) {
            n = n%2 == 0 ? n/2 : 3*n+1;
            str += n + " ";
        }
        
        String[] arr = str.split(" ");
        int[] answer = new int[arr.length];
        for(int i=0; i<answer.length; i++) {
            answer[i] = Integer.valueOf(arr[i]);
        }
        
        return answer;
    }
}




import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        while (n > 1) {
            list.add(n);
            n = n % 2 == 0 ? (n / 2) : (3 * n + 1);
        }
        list.add(1);

        return list.stream().mapToInt(i -> i).toArray();
    }
}
