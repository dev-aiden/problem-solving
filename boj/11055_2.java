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
        for(int i = 1; i <= n; ++i) {
            a[i] = Integer.parseInt(st.nextToken()); d[i] = a[i];
            for(int j = 1; j < i; ++j) {
                if (a[j] < a[i] && d[j] + a[i] > d[i]) d[i] = d[j] + a[i];
            }
            if (ans < d[i]) ans = d[i];
        }
        System.out.println(ans);
    }
}
