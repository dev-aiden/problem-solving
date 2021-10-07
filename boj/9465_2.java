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
            int n = Integer.parseInt(br.readLine());
            for(int i = 0; i < 2; ++i) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 1; j <= n; ++j) arr[j][i] = Integer.parseInt(st.nextToken());
            }
            for(int i = 1; i <= n; ++i) {
                d[i][0] = max(max(d[i - 1][0], d[i - 1][1]), d[i - 1][2]);
                d[i][1] = max(d[i - 1][0], d[i - 1][2]) + arr[i][1];
                d[i][2] = max(d[i - 1][0], d[i - 1][1]) + arr[i][0];
            }
            sb.append(max(max(d[n][0], d[n][1]), d[n][2])).append("\n");
        }
        System.out.println(sb);
    }
}
