class Solution {
    public int solution(int n) {
        // n의 제곱근을 계산
        double sqrt = Math.sqrt(n);

        // 제곱근을 정수로 변환한 후, 다시 제곱하여 n과 비교
        if (n == Math.pow((int)sqrt, 2)) {
            // n이 제곱수라면 1을 반환
            return 1;
        } else {
            // 제곱수가 아니라면 2를 반환
            return 2;
        }
    }
}