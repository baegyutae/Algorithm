class Solution {
    public String solution(String s) {
        int length = s.length();
        int middle = length / 2;
        
        // 짝수인 경우
        if (length % 2 == 0) {
            return s.substring(middle - 1, middle + 1);
        }

        // 홀수인 경우
        else {
            return s.substring(middle, middle + 1);
        }
    }
}