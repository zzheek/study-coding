class Solution {
    public int[] solution(int[] arr, int n) {
       // int[] answer = {};

        if(arr.length%2 == 1){
            for(int i=0; i<arr.length; i+=2) {
                arr[i] += n;
            }
        } else {
            for(int i=1; i<=arr.length; i+=2) {
                arr[i] += n;
            }
        }
         
        return arr;
    }
}




class Solution {
    public int[] solution(int[] arr, int n) {
        for (int i = arr.length - 1; i >= 0; i -= 2) {
            arr[i] += n;
        }
        return arr;
    }
}
