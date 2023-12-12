import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int start = command[0] - 1; // 배열 인덱스는 0부터 시작하므로 1을 빼줌
            int end = command[1];
            int k = command[2];

            // 배열 자르기
            int[] slicedArray = Arrays.copyOfRange(array, start, end);

            // 자른 배열 정렬
            Arrays.sort(slicedArray);

            // k번째 숫자 찾아서 answer에 저장
            answer[i] = slicedArray[k - 1];
        }

        return answer;
    }
}