import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 가로 길이
        int m = sc.nextInt(); // 세로 길이

        for (int i = 0; i < m; i++) { // 세로 길이만큼 반복
            for (int j = 0; j < n; j++) { // 가로 길이만큼 별을 찍음
                System.out.print("*");
            }
            System.out.println(); // 한 줄을 출력하고 줄 바꿈
        }
    }
}