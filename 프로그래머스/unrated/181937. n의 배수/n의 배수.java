class Solution {
    public int solution(int num, int n) {
        // num이 n의 배수인지 확인
        if (num % n == 0) {
            return 1; // num은 n의 배수입니다
        } else {
            return 0; // num은 n의 배수가 아닙니다
        }
    }
}