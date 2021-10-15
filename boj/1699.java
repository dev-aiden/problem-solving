import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int a[] = new int[100003];
    static int d[] = new int[100003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solve(n));
    }

    public static int solve(int n) {
        if (n == 1) return 1;
        if (d[n] > 0) return d[n];
        d[n] = n;
        for (int i = 1; i * i <= n; ++i) {
            if (d[n] > solve(n - i * i) + 1) {
                d[n] = solve(n - i * i) + 1;
            }
        }
        return d[n];
    }
}
