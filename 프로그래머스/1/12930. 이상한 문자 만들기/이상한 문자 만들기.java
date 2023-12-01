class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0; // 단어별 위치를 추적

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                answer.append(ch);
                index = 0; // 공백을 만나면 위치를 초기화합니다.
            } else {
                if (index % 2 == 0) {
                    answer.append(Character.toUpperCase(ch)); // 짝수 위치의 문자는 대문자로
                } else {
                    answer.append(Character.toLowerCase(ch)); // 홀수 위치의 문자는 소문자로
                }
                index++;
            }
        }

        return answer.toString();
    }
}
