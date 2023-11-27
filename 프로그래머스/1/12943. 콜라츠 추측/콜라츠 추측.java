class Solution {
    public int solution(int num) {
        long n = num;
        int count = 0;
        
        while (n != 1) {
            if (count == 500) { // 500번 반복해도 1이 되지 않으면 -1 반환
                return -1;
            }
            if (n % 2 == 0) { // n이 짝수인 경우
                n /= 2;
            } else { // n이 홀수인 경우
                n = n * 3 + 1;
            }
            count++; // 반복 횟수 증가
        }
        return count; // 반복 횟수 반환
    }
}