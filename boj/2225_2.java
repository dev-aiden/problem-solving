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
        d[0][0] = 1L;
        for (int i = 1; i <= k; ++i) {
            for (int j = 0; j <= n; ++j) {
                for (int l = 0; l <= j; ++l) {
                    d[i][j] += d[i - 1][j - l];
                    d[i][j] %= 1000000000;
                }
            }
        }
        System.out.println(d[k][n]);
    }
}
