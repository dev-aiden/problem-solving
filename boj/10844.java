import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int d[][] = new int[103][13];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0; i < 10; ++i) {
            result += solve(n, i);
            result %= 1000000000;
        }
        System.out.println(result);
    }

    public static int solve(int n, int a) {
        int ret = 0;
        if (n == 1) {
            if (a == 0) return 0;
            else return 1;
        }
        if ((a - 1) >= 0) {
            if (d[n - 1][a - 1] == 0) d[n - 1][a - 1] = solve(n - 1, a - 1);
            ret += d[n - 1][a - 1];
            ret %= 1000000000;
        }
        if ((a + 1) <= 9) {
            if (d[n - 1][a + 1] == 0) d[n - 1][a + 1] = solve(n - 1, a + 1);
            ret += d[n - 1][a + 1];
            ret %= 1000000000;
        }
        return ret;
    }
}
