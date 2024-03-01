import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); // 입력 받은 N 값을 정수로 변환
        
        // 1부터 N까지 반복
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*"); // j가 i와 같거나 작을 때까지 별을 찍는다
            }
            System.out.println(); // 한 줄이 끝나면 다음 줄로 넘어감
        }
        
        br.close(); // BufferedReader를 닫아 리소스를 해제
    }
}
