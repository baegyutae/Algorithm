import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N과 X 입력
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        // 수열 A를 이루는 정수 입력 및 출력
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num < X) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
