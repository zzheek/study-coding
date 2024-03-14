import java.util.*;

class Solution {
    public int solution(int[] ingredients) {
        int sandwichCount = 0; // 상수가 포장한 햄버거의 개수
        List<Integer> ingredientList = new ArrayList<>(); // 재료 리스트

        // 재료 배열을 순회하면서 햄버거를 만들고 포장하는 과정을 수행
        for (int ingredient : ingredients) {
            ingredientList.add(ingredient); // 재료를 리스트에 추가

            // 재료가 쌓여서 햄버거를 만들 수 있는지 확인하고 포장
            while (ingredientList.size() >= 4) {
                int size = ingredientList.size(); // 현재 재료 리스트의 크기
                // 빵-야채-고기-빵 순서로 재료가 쌓여있는지 확인
                if (!(ingredientList.get(size - 1) == 1
                        && ingredientList.get(size - 2) == 3
                        && ingredientList.get(size - 3) == 2
                        && ingredientList.get(size - 4) == 1))
                    break; // 조건에 맞지 않으면 반복문 탈출
                // 햄버거를 만들기 위해 필요한 재료 제거
                for (int i = 0; i < 4; i++) {
                    ingredientList.remove(ingredientList.size() - 1);
                }
                sandwichCount++; // 햄버거 포장 개수 증가
            }
        }
        return sandwichCount; // 포장된 햄버거 개수 반환
    }
}



