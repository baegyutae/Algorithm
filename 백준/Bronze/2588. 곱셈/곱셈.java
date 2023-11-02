import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int firstNum = Integer.parseInt(br.readLine());
        int secondNum = Integer.parseInt(br.readLine());

        int result1 = firstNum * (secondNum % 10);
        int result2 = firstNum * ((secondNum / 10) % 10);
        int result3 = firstNum * (secondNum / 100);
        int finalResult = firstNum * secondNum;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(finalResult);
        
        br.close();
    }
}