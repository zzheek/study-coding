import java.util.*;

class Solution {
    public int[] solution(String[] parkMap, String[] commands) {
        return moveDogInPark(parkMap, commands);
    }

    public int[] moveDogInPark(String[] parkMap, String[] commands) {
        /*
         * @Desc
         * 1. 2차원 배열(map)을 만들어 지나갈 수 있는지 여부를 저장
         * 2. 현재 위치의 인덱스를 변수로 설정 (rowIndex, colIndex)
         * 3. 방향과 거리만큼 인덱스를 이동했을 때 가능한지 여부를 체크
         * 4. 인덱스 이동이 가능하다면 현재 위치의 값으로 설정
         * 고정 배열로 리턴
         */
        int rowIndex = 0, colIndex = 0;
        int[][] map = new int[parkMap.length][parkMap[0].length()];
        
        // 공원 지도 초기화
        for (int i 0; i<parkMap.length; i++) {
            String[] rowSections = parkMap[i].split("");
            for (int j = 0; j < rowSections.length; j++) {
                String section = rowSections[j];
                rowIndex = "S".equals(section) ? i : rowIndex; // 시작 위치의 행 인덱스 저장
                colIndex = "S".equals(section) ? j : colIndex; // 시작 위치의 열 인덱스 저장
                map[i][j] = "X".equals(section) ? 1 : 0; // 장애물 여부에 따라 값 설정
            }
        }

        // 주어진 명령에 따라 강아지 이동
        for (String command : commands) {
            String[] commandParts = command.split(" ");
            String direction = commandParts[0];
            int distance = Integer.parseInt(commandParts[1]);

            for (int i = 1; i <= distance; i++) {
                int tmpRowIndex = rowIndex;
                int tmpColIndex = colIndex;
                
                // 각 방향으로 이동할 때의 임시 인덱스 계산
                switch(direction) {
                    case "E": tmpColIndex += i; break; // 동쪽으로 이동
                    case "W": tmpColIndex -= i; break; // 서쪽으로 이동
                    case "S": tmpRowIndex += i; break; // 남쪽으로 이동
                    case "N": tmpRowIndex -= i; break; // 북쪽으로 이동
                }
                
                // 이동 가능 여부 확인
                if (tmpRowIndex < 0 || tmpRowIndex >= parkMap.length || 
                    tmpColIndex < 0 || tmpColIndex >= parkMap[0].length() || 
                    map[tmpRowIndex][tmpColIndex] == 1) {
                    break; // 이동 불가능할 경우 반복문 종료
                }
                
                // 강아지의 이동 거리가 명령어에 주어진 거리와 일치할 경우 현재 위치 갱신
                if (Math.sqrt(Math.pow(rowIndex - tmpRowIndex, 2) + Math.pow(colIndex - tmpColIndex, 2)) == distance) {
                    rowIndex = tmpRowIndex;
                    colIndex = tmpColIndex;
                }
            }
        }
        
        // 최종 위치 반환
        return new int[]{rowIndex, colIndex};
    }
}
