import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        
        for(int i =0; i<numlist.length; i++){
            for(int j=0; j<numlist.length; j++){
                if(Math.abs(n-numlist[i]) <= Math.abs(n-numlist[j])){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] =temp;
                }
            }
        }
        
        return numlist;
    }
}




import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList, int n) {
        return Arrays.stream(numList)
                .boxed()
                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
