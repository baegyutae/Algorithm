import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 바구니 개수 N 입력
        int M = scanner.nextInt(); // 공을 넣는 횟수 M 입력

        int[] baskets = new int[N]; // 바구니 배열 생성

        for (int i = 0; i < M; i++) {
            int start = scanner.nextInt(); // 시작 바구니 번호 입력
            int end = scanner.nextInt(); // 끝 바구니 번호 입력
            int ballNumber = scanner.nextInt(); // 넣을 공의 번호 입력

            for (int j = start - 1; j <= end - 1; j++) { // 시작 바구니부터 끝 바구니까지 반복
                baskets[j] = ballNumber; // 공을 넣는다
            }
        }

        // 바구니 상태 출력
        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }

        scanner.close();
    }
}
