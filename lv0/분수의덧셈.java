class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        //기약분수 하는 법은 분모와 분자를 그들의 최대공약수로 나누면 됩니다.
        //즉, 분모와 분자를 각각 같은 수로 나눠서 1이 아닌 다른 수로 더 이상 나눠지지 않게. 
        
        // step1 : 두 분수를 더한 값을 기약 분수로
        // step2 : 분자와 분모를 순서대로 담은 배열 return
               
        int commonNumer1 = numer1 * denom2; //분자1
        int commonNumer2 = numer2 * denom1; //분자2
        int commonNumer = commonNumer1+commonNumer2; //분자의 덧셈
        int commonDen = denom1 * denom2; //통분
        
        int gcd = 0;
        
        //최대공약수 찾기
        for(int i=1; i <= commonNumer && i <= commonDen  ;i++){
            if( commonNumer%i == 0 && commonDen%i ==0 ){
                gcd = i;
            }
        }
        
        commonNumer = commonNumer/gcd; // 기약분수 분자
        commonDen = commonDen/gcd; // 기약분수 분모
        
        int[] answer = {commonNumer, commonDen};
        
        
        return answer;
    }
}
