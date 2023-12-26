import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] bc = before.toCharArray();
        char[] ac = after.toCharArray();

        Arrays.sort(bc);
        Arrays.sort(ac);

        return Arrays.equals(bc, ac) ? 1 : 0;
    }
}
