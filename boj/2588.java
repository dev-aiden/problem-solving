import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int ans = 0, temp = 1;
        while (b != 0) {
            int num = a * (b % 10);
            sb.append(num).append("\n");
            b /= 10;
            ans += (num * temp);
            temp *= 10;
        }
        sb.append(ans).append("\n");
        System.out.println(sb);
    }
}
