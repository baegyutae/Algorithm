class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        
        // 전화번호의 앞부분을 '*'로 치환
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer.append('*');
        }
        
        // 전화번호의 마지막 4자리를 그대로 추가
        answer.append(phone_number.substring(phone_number.length() - 4));

        return answer.toString();
    }
}