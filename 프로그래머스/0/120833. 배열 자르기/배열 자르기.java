import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // num1번째 인덱스부터 num2번째 인덱스까지의 배열을 복사하여 반환합니다.
        // 주의: num2는 범위에 포함되지 않으므로, 실제로는 num2+1까지 복사해야 합니다.
        int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        return answer;
    }
}
