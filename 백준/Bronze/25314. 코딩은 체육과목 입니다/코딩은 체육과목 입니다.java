import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N을 입력받음
        int N = Integer.parseInt(br.readLine());
        
        // N을 4로 나눈 값이 long을 붙여야 하는 횟수
        int count = N / 4;
        
        StringBuilder sb = new StringBuilder();
        // count만큼 long을 붙임
        for (int i = 0; i < count; i++) {
            sb.append("long ");
        }
        // 마지막에 int를 붙임
        sb.append("int");
        
        // 결과 출력
        System.out.println(sb.toString());
    }
}
