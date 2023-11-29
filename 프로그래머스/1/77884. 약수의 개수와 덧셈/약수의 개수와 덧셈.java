class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            // 제곱근이 정수인지 확인 (완전제곱수 여부)
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                answer -= i; // 약수의 개수가 홀수인 경우
            } else {
                answer += i; // 약수의 개수가 짝수인 경우
            }
        }
        
        return answer;
    }
}