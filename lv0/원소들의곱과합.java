class Solution {
    public int solution(int[] num_list) {
        int a = 0;
        int b = 1;
        
        for(int i=0; i<num_list.length; i++) {
            a += num_list[i];
            b *= num_list[i];
        }
        return a*a > b ? 1:0;
    }
}
