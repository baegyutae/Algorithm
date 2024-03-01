import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 바구니 개수 N 입력
        int M = scanner.nextInt(); // 공을 바꾸는 횟수 M 입력

        int[] baskets = new int[N]; // 바구니 배열 생성

        // 초기 바구니 설정
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        // 공을 바꾸는 횟수만큼 반복
        for (int i = 0; i < M; i++) {
            int idx1 = scanner.nextInt() - 1; // 첫 번째 바구니 인덱스 입력
            int idx2 = scanner.nextInt() - 1; // 두 번째 바구니 인덱스 입력

            // 바구니 내의 공 교환
            int temp = baskets[idx1];
            baskets[idx1] = baskets[idx2];
            baskets[idx2] = temp;
        }

        // 바구니 상태 출력
        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }

        scanner.close();
    }
}
