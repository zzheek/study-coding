class Solution {
    public int[] solution(String[] wallpaper) {
        // 최소값은 가능한 가장 큰 값으로, 최대값은 0으로 설정
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = 0;
        int maxY = 0;
        
        // wallpaper 배열의 각 문자열(각 행)에 대해 반복
        for (int i=0; i<wallpaper.length; i++) {
            // 각 행의 각 문자(열)에 대해 반복
            for (int j=0; j<wallpaper[i].length(); j++) {
                // '#' 문자를 찾으면, 해당 문자의 좌표를 사용하여
                // 최소 및 최대 x, y 좌표를 갱신
                if (wallpaper[i].charAt(j) == '#') {
                    minX = Math.min(minX, i); // y좌표의 최소값 갱신
                    minY = Math.min(minY, j); // x좌표의 최소값 갱신
                    maxX = Math.max(maxX, i); // y좌표의 최대값 갱신
                    maxY = Math.max(maxY, j); // x좌표의 최대값 갱신
                }
            }
        }
        
        // 계산된 최소 및 최대 좌표를 바탕으로 사각형의 좌측 상단(minX, minY)과
        // 우측 하단(maxX+1, maxY+1) 좌표를 반환
        // 여기서 +1은 해당 좌표를 포함하는 사각형의 크기를 정확히 지정하기 위함
        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }
}
