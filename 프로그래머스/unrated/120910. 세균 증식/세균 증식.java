class Solution {
    public int solution(int n, int t) {
        // 초기 세균 수(n)에 2의 t제곱을 곱하여 t시간 후 세균의 수를 계산합니다.
        int answer = (int)(n * Math.pow(2, t));

        return answer;
    }
}