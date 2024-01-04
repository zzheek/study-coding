class Solution {
    public int solution(String myString, String pat) {
        String str = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');
        return str.contains(pat) ? 1 : 0 ;
    }
}




