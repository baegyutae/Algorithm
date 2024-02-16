import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N을 입력 받음
        int N = sc.nextInt();
        
        // 1부터 9까지 N과 곱한 결과를 출력
        for(int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }
    }
}