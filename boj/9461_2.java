import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] d = new long[103];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        d[1] = d[2] = d[3] = 1; d[4] = d[5] = 2;
        for(int i = 6; i <= 100; ++i) d[i] = d[i - 5] + d[i - 1];
        for(int t = Integer.parseInt(br.readLine()); t-- > 0;) {
            int n = Integer.parseInt(br.readLine());
            sb.append(d[n]).append("\n");
        }
        System.out.println(sb);
    }
}
