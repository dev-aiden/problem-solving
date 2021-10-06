import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int d[][] = new int[1003][13];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < 10; ++i) d[1][i] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int j = 0; j < 10; ++j) {
                for (int k = 0; k <= j; ++k) {
                    d[i][j] += d[i - 1][k];
                    d[i][j] %= 10007;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < 10; ++i) {
            ans += d[n][i];
            ans %= 10007;
        }
        System.out.println(ans);
    }
}
