class Solution {

    public String solution(String s, int n) {
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

            // 대문자인 경우
            if (Character.isUpperCase(currentChar)) {
                charArray[i] = (char) ((currentChar - 'A' + n) % 26 + 'A');
            }

            // 소문자인 경우
            else if (Character.isLowerCase(currentChar)) {
                charArray[i] = (char) ((currentChar - 'a' + n) % 26 + 'a');
            }
            // 공백인 경우는 그대로 유지
        }

        return new String(charArray);
    }
}