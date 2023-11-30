import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 문자열을 char 배열로 변환
        char[] charArray = s.toCharArray();

        // char 배열을 내림차순으로 정렬
        Arrays.sort(charArray);

        // 정렬된 char 배열을 뒤집어서 내림차순으로 변환
        StringBuilder sb = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            sb.append(charArray[i]);
        }

        // 결과 문자열 반환
        return sb.toString();
    }
}