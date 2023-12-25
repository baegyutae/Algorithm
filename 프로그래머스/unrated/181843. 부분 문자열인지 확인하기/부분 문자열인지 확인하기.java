class Solution {
    public int solution(String my_string, String target) {
        // 문자열 my_string이 target을 포함하고 있다면 1을 반환, 그렇지 않으면 0을 반환
        return my_string.contains(target) ? 1 : 0;
    }
}