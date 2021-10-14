import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.max;

public class Main {

    static int d[] = new int[303];
    static int a[] = new int[303];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; ++i) a[i] = Integer.parseInt(br.readLine());
        System.out.println(solve(n));
    }

    public static int solve(int n) {
        if(n == 0) return 0;
        if(n <= 2) return a[n - 1] + a[n];
        if(d[n] > 0) return d[n];
        return d[n] = max(solve(n - 2) + a[n], solve(n - 3) + a[n - 1] + a[n]);
    }
}
