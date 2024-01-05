class Solution {
    public int[] solution(int money) {
        // 아이스 아메리카노 한 잔의 가격
        final int PRICE_PER_CUP = 5500;

        // 최대로 구매할 수 있는 아메리카노의 수
        int cups = money / PRICE_PER_CUP;

        // 남은 돈
        int remaining = money % PRICE_PER_CUP;

        // 결과를 배열에 담아 반환
        int[] answer = {cups, remaining};
        return answer;
    }
}
