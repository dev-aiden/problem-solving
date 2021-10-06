import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int d[][] = new int[1003][13];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 0; i < 10; ++i) {
            ans += solve(n, i);
            ans %= 10007;
        }
        System.out.println(ans);
    }

    public static int solve(int n, int a) {
        if (n == 1) return 1;
        if (d[n][a] > 0) return d[n][a];
        for (int i = 0; i <= a; ++i) {
            d[n][a] += solve(n - 1, i);
            d[n][a] %= 10007;
        }
        return d[n][a];
    }
}
