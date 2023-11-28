class Solution {
    public int solution(int[] numbers) {
        int sum = 45; // 0부터 9까지의 합은 45

        // 배열에 있는 숫자들을 합에서 빼준다.
        for (int number : numbers) {
            sum -= number;
        }
        
        return sum; // 남은 합을 반환
    }
}