import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        // s1의 원소를 저장할 Set을 생성합니다.
        Set<String> set = new HashSet<>();
        for (String element : s1) {
            set.add(element);
        }

        // s2의 원소를 순회하면서 Set에 존재하는지 확인합니다.
        int answer = 0;
        for (String element : s2) {
            if (set.contains(element)) {
                answer++;
            }
        }

        return answer;
    }
}
