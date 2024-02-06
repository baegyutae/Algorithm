class Solution {
    public int solution(int[] array, int n) {
        // 정답을 저장할 변수를 0으로 초기화합니다.
        int answer = 0;
        
        // 배열 array의 각 원소에 대해 반복합니다.
        for (int num : array) {
            // 현재 원소가 n과 같다면 answer를 1 증가시킵니다.
            if (num == n) {
                answer++;
            }
        }
        
        // 최종적으로 구한 중복된 숫자의 개수를 반환합니다.
        return answer;
    }
}
