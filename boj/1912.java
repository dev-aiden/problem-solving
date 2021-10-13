import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.max;

public class Main {

    static int a[] = new int[100003];
    static int d[] = new int[100003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; ++i) {
            a[i] = Integer.parseInt(st.nextToken());
            if (i == 1) {
                ans = d[1] = a[1];
                continue;
            }
            d[i] = -2147483648;
            solve(i);
            if (ans < d[i]) ans = d[i];
        }
        System.out.println(ans);
    }

    public static int solve(int n) {
        if (d[n] != -2147483648) return d[n];
        return d[n] = max(solve(n - 1) + a[n], a[n]);
    }
}
