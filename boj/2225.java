import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long[][] d = new long[203][203];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(solve(k, n));
    }

    public static Long solve(int k, int n) {
        if (k == 1) return 1L;
        if (d[k][n] > 0) return d[k][n];
        for (int i = 0; i <= n; ++i) {
            d[k][n] += solve(k - 1, i);
            d[k][n] %= 1000000000;
        }
        return d[k][n];
    }
}
