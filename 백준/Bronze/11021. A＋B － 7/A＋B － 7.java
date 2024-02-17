import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 테스트 케이스의 개수 T를 입력받음
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            // 각 테스트 케이스에서 두 정수 A, B를 입력받음
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            // "Case #x: " 형식으로 테스트 케이스 번호와 A+B의 합을 출력
            System.out.println("Case #" + i + ": " + (A + B));
        }
    }
}
