import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int d[] = new int[1003];
    static int a[] = new int[1003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ans = 0;
        d[1] = 1;
        for (int i = 1; i <= n; ++i) {
            a[i] = Integer.parseInt(st.nextToken());
            solve(i);
        }
        for (int i = 1; i <= n; ++i) if(ans < d[i]) ans = d[i];
        System.out.println(ans);
    }

    public static int solve(int n) {
        if (n == 1) return 1;
        if (d[n] > 0) return d[n];
        d[n] = 1;
        for (int i = n - 1; i >= 1; --i) {
            if (a[n] > a[i] && d[n] < solve(i) + 1) d[n] = d[i] + 1;
        }
        return d[n];
    }
}
