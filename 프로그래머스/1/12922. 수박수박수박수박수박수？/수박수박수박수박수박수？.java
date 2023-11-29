class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        
        // "수박"을 n/2 반복
        for (int i = 0; i < n / 2; i++) {
            answer.append("수박");
        }
        
        // n이 홀수라면 "수"를 추가
        if (n % 2 != 0) {
            answer.append("수");
        }

        return answer.toString();
    }
}