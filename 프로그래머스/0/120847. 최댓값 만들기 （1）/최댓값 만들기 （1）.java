import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // numbers 배열을 정렬합니다.
        Arrays.sort(numbers);
        
        // 배열의 길이
        int n = numbers.length;
        
        // 가장 큰 두 수의 곱과 가장 작은 두 수의 곱 중 더 큰 값을 찾습니다.
        // 가장 큰 두 수의 곱은 numbers[n-1] * numbers[n-2] 입니다.
        // 가장 작은 두 수의 곱(음수를 고려했을 때)은 numbers[0] * numbers[1] 입니다.
        return Math.max(numbers[n-1] * numbers[n-2], numbers[0] * numbers[1]);
    }
}
