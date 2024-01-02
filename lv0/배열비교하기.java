class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sumArr1 = 0;
        int sumArr2 = 0;

        for (int num : arr1) {
            sumArr1 += num;
        }

        for (int num : arr2) {
            sumArr2 += num;
        }

        if (arr1.length != arr2.length) {
            return (arr1.length > arr2.length) ? 1 : -1;
        } else {
            return Integer.compare(sumArr1, sumArr2);
        }
    }
}
