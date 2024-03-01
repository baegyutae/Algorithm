import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수의 개수 N 입력
        int N = scanner.nextInt();

        // 정수 배열 입력
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 찾으려는 정수 v 입력
        int v = scanner.nextInt();

        // 정수 배열에서 v와 일치하는 개수 계산
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (numbers[i] == v) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);

        scanner.close();
    }
}
