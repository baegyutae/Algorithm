class Solution {
    public int solution(int[] num_list, int n) {
        // num_list 배열을 순회하면서 n을 찾는다.
        for (int num : num_list) {
            if (num == n) {
                // n을 찾으면 1을 반환
                return 1;
            }
        }
        // 배열 전체를 순회한 후에도 n을 찾지 못하면 0을 반환
        return 0;
    }
}