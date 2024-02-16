class Solution {
    public int solution(int[][] sizes) {
        int maxw = 0;
        int maxh = 0;
        
        for (int i=0; i<sizes.length; i++) {
            maxw = Math.max(maxw, Math.max(sizes[i][0], sizes[i][1]));
            maxh = Math.max(maxh, Math.min(sizes[i][0], sizes[i][1]));
        }
        
        
        return maxw * maxh;
    }
}


