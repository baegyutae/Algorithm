class Solution {
    public int[] solution(int[] numbers) {
        // numbers 배열의 길이와 동일한 크기의 배열 생성
        int[] answer = new int[numbers.length];
        
        // numbers 배열의 각 원소에 대해 루프를 실행
        for (int i = 0; i < numbers.length; i++) {
            // numbers 배열의 i번째 원소를 두 배하여 answer 배열에 저장
            answer[i] = numbers[i] * 2;
        }
        
        // 결과 배열 반환
        return answer;
    }

}