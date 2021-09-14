import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        if(n == 1) {
            System.out.println("*");
            return;
        }
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i; j < n - 1; ++j) sb.append(" ");
            sb.append("*");
            if (i != 0) {
                for (int j = 0; j < i * 2 - 1; ++j) sb.append(" ");
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int j = 0; j < n * 2 - 1; ++j) sb.append("*");
        sb.append("\n");
        System.out.println(sb);
    }
}
