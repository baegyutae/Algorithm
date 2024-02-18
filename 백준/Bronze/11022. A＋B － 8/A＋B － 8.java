import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수 T를 입력받음
        
        for (int i = 1; i <= T; i++) {
            String[] inputs = br.readLine().split(" ");
            int A = Integer.parseInt(inputs[0]);
            int B = Integer.parseInt(inputs[1]);
            int sum = A + B;
            // "Case #x: A + B = C" 형식으로 출력
            bw.write("Case #" + i + ": " + A + " + " + B + " = " + sum + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
