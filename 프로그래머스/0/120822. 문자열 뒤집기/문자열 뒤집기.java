class Solution {
    public String solution(String my_string) {
        // 새로운 문자열을 저장할 변수를 만듭니다.
        String reversedString = "";
        
        // 주어진 문자열의 길이를 가져옵니다.
        int length = my_string.length();
        
        // 문자열을 뒤집습니다.
        for (int i = length - 1; i >= 0; i--) {
            // 문자열의 각 문자를 새로운 문자열에 추가합니다.
            reversedString += my_string.charAt(i);
        }
        
        // 뒤집은 문자열을 반환합니다.
        return reversedString;
    }
}
