import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수 T를 입력받음
        
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" "); // 공백을 기준으로 A와 B를 입력받음
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            
            int sum = A + B; // A와 B의 합을 계산
            
            bw.write(sum + "\n"); // 계산된 합을 출력
        }
        
        br.close(); // BufferedReader를 닫는다.
        bw.flush(); // 남아있는 데이터를 모두 출력
        bw.close(); // BufferedWriter를 닫는다.
    }
}