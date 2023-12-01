class Solution {
    public int solution(int[] number) {
        int answer = 0;

        // 배열 내의 모든 조합을 확인
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    // 세 숫자의 합이 0이면 카운트 증가
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}