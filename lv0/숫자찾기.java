class Solution {
    public int solution(int num, int k) {
        
        String numStr = Integer.toString(num);

        for (int i=0; i<numStr.length(); i++) {
            if (numStr.charAt(i) == Character.forDigit(k, 10)) {
                return i+1; 
            }
        }

        return -1; 
    }
}





class Solution {
    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }
}
