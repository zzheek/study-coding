class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;

        for(int i=1; i<=count; i++) {
            total += i*price;
        }
        return (money > total) ? 0 : (total - money);
    }
}




class Solution {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
