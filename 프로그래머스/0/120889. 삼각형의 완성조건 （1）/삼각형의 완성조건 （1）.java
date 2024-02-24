import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        // 세 변을 길이에 따라 오름차순으로 정렬합니다.
        Arrays.sort(sides);
        
        // 삼각형 성립 조건 검사: 가장 긴 변(sides[2])이 나머지 두 변(sides[0] + sides[1])의 합보다 작아야 합니다.
        if (sides[2] < sides[0] + sides[1]) {
            // 삼각형을 만들 수 있음
            return 1;
        } else {
            // 삼각형을 만들 수 없음
            return 2;
        }
    }
}
