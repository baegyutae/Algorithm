import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0; // 최댓값을 저장할 변수
        int position = 0; // 최댓값이 몇 번째 수인지를 저장할 변수

        for (int i = 1; i <= 9; i++) {
            int num = scanner.nextInt(); // 자연수 입력
            if (num > max) { // 현재 값이 최댓값보다 크다면
                max = num; // 최댓값을 갱신
                position = i; // 최댓값의 위치를 저장
            }
        }

        System.out.println(max); // 최댓값 출력
        System.out.println(position); // 최댓값이 몇 번째 수인지 출력

        scanner.close();
    }
}
