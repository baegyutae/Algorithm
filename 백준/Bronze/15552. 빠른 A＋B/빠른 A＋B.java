import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 개수 T를 입력받음
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            // 각 테스트 케이스에서 두 정수 A, B를 입력받음
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            // A와 B의 합을 출력
            bw.write((A + B) + "\n");
        }
        
        // BufferedWriter를 플러시하여 남아있는 데이터를 모두 출력
        bw.flush();
        
        // 자원을 해제
        br.close();
        bw.close();
    }
}
