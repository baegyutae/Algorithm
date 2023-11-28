class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            // sings[i]가 true이면 양수, false이면 음수로 처리
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return answer;
    }
}