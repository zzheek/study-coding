import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        // 결과를 저장할 ArrayList를 생성합니다.
        ArrayList<Integer> stk = new ArrayList<>();

        // 주어진 배열을 순회합니다.
        for (int i = 0; i < arr.length; i++) {
            // 1. stk이 비어있으면 현재 arr[i]를 추가하고 i를 증가시킵니다.
            if (stk.isEmpty()) {
                stk.add(arr[i]);
            } 
            // 2. stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 제거하고 i를 증가시킵니다.
            else if (stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
            } 
            // 3. stk의 마지막 원소가 arr[i]와 다르면 stk에 arr[i]를 추가하고 i를 증가시킵니다.
            else {
                stk.add(arr[i]);
            }
        }

        // 최종적으로 만들어진 stk을 배열로 변환합니다.
        if (stk.isEmpty()) {
            // stk이 비어있다면 [-1]을 반환합니다.
            return new int[]{-1};
        } else {
            // stk이 비어있지 않다면 ArrayList를 int 배열로 변환하여 반환합니다.
            int[] result = new int[stk.size()];
            for (int i = 0; i < stk.size(); i++) {
                result[i] = stk.get(i);
            }
            return result;
        }
    }
}




import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int no : arr) {
            if (!stack.isEmpty() && no == stack.peek()) {
                stack.pop();
            } else {
                stack.push(no);
            }
        }

        return stack.isEmpty() ? new int[] { -1 } : stack.stream().mapToInt(i -> i).toArray();
    }
}
