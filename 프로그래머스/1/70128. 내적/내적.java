class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        // 배열의 각 요소에 대해 곱셈을 수행하고 결과를 더한다.
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}