class Solution {
    public int[] solution(int[] num_list) {
        // 짝수와 홀수를 세기 위한 변수를 0으로 초기화합니다.
        int evenCount = 0;
        int oddCount = 0;
        
        // 주어진 배열을 순회하면서 각 원소가 짝수인지 홀수인지를 판별합니다.
        for (int num : num_list) {
            if (num % 2 == 0) {
                // 원소가 짝수일 경우, 짝수 카운트를 증가시킵니다.
                evenCount++;
            } else {
                // 원소가 홀수일 경우, 홀수 카운트를 증가시킵니다.
                oddCount++;
            }
        }
        
        // 결과 배열에 짝수와 홀수의 개수를 저장합니다.
        int[] answer = {evenCount, oddCount};
        
        // 결과 배열을 반환합니다.
        return answer;
    }
}
