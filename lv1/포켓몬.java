import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        // HashSet은 중복된 값을 허용 X -> 중복 제거 
        HashSet<Integer> po = new HashSet<>();
        
        for(int num : nums) {
            po.add(num);
        }
        
        int maxSelect = nums.length / 2;


        // 선택할 수 있는 폰켓몬의 종류의 최댓값은 다음 두 값 중 작은 값
        // 1. 배열 내의 고유한 폰켓몬 종류의 수 (po.size())
        // 2. 선택할 수 있는 폰켓몬의 최대 수 (maxSelect)
        // Math.min 함수를 사용하여 두 값 중 더 작은 값을 반환
        return Math.min(po.size(), maxSelect);
    }
}



