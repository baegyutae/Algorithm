class Solution {
    public int solution(int number, int n, int m) {
        // number가 n의 배수이면서 동시에 m의 배수인 경우 1을 반환, 그렇지 않으면 0을 반환
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }
}