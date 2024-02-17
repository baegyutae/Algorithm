import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 총 금액 X를 입력받음
        int X = Integer.parseInt(br.readLine());
        // 구매한 물건의 종류의 수 N을 입력받음
        int N = Integer.parseInt(br.readLine());
        
        // 구매한 물건의 가격과 개수로 계산한 총 금액을 저장할 변수
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            // 물건의 가격 a와 개수 b를 입력받음
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 가격과 개수를 곱하여 sum에 더함
            sum += a * b;
        }
        
        // 계산한 총 금액이 영수증의 총 금액과 일치하는지 검사
        if (X == sum) {
            System.out.println("Yes"); // 일치하면 Yes 출력
        } else {
            System.out.println("No"); // 일치하지 않으면 No 출력
        }
    }
}
