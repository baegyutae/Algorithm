import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    public int[] solution(int[] numbers) {
        Set<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++ ) {
                resultSet.add(numbers[i] + numbers[j]);
            }
        }

        // Set을 배열로 변환
        int[] answer = resultSet.stream().mapToInt(Integer::intValue).toArray();

        // 배열을 오름차순으로 정렬
        Arrays.sort(answer);

        return answer;
    }
}