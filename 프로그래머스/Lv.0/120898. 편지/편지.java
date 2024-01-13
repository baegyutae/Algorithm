class Solution {
    public int solution(String message) {
        int answer = 0;
        
        // message의 길이에 2를 곱하여 필요한 편지지의 가로길이 계산
        answer = message.length() * 2;

        return answer;
    }
}
