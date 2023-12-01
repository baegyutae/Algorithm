class Solution {
    public int solution(int n) {
        String ternary = "";
        
        while (n > 0) {
            ternary = (n % 3) + ternary;
            n /= 3;
        }

        String reversedTernary = new StringBuilder(ternary).reverse().toString();

        int answer = 0;
        int base = 1;
        for (int i = reversedTernary.length() - 1; i >= 0; i--) {
            answer += (reversedTernary.charAt(i) - '0') * base;
            base *= 3;
        }

        return answer;
    }
}