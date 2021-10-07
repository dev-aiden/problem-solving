import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.max;

public class Main {

    static int d[][] = new int[100003][3];
    static int arr[][] = new int[100003][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int t = Integer.parseInt(br.readLine()); t-- > 0;) {
            for (int i = 0; i <= 100000; ++i) {
                for (int j = 0; j < 3; ++j) d[i][j] = -1;
            }
            int n = Integer.parseInt(br.readLine());
            for(int i = 0; i < 2; ++i) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 1; j <= n; ++j) arr[j][i] = Integer.parseInt(st.nextToken());
            }
            sb.append(max(max(solve(n, 0), solve(n, 1)), solve(n, 2))).append("\n");
        }
        System.out.println(sb);
    }

    public static int solve(int n, int a) {
        if (n == 0) return 0;
        if (d[n][a] != -1) return d[n][a];
        if (a == 0) d[n][a] = max(max(solve(n - 1, 0), solve(n - 1, 1)), solve(n - 1, 2));
        else if (a == 1) d[n][a] = max(solve(n - 1, 0), solve(n - 1, 2)) + arr[n][1];
        else if (a == 2) d[n][a] = max(solve(n - 1, 0), solve(n - 1, 1)) + arr[n][0];
        return d[n][a];
    }
}
