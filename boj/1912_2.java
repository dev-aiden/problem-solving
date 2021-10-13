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
            d[i] = max(d[i - 1] + a[i], a[i]);
            if (ans < d[i]) ans = d[i];
        }
        System.out.println(ans);
    }
}
