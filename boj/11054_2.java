import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int a[] = new int[1003];
    static int d1[] = new int[1003];
    static int d2[] = new int[1003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; ++i) {
            a[i] = Integer.parseInt(st.nextToken()); d1[i] = 1;
            for (int j = 1; j < i; ++j) {
                if (a[j] < a[i] && d1[i] < d1[j] + 1) d1[i] = d1[j] + 1;
            }
        }
        int ans = 0;
        for (int i = n; i >= 1; --i) {
            d2[i] = 1;
            for (int j = n; j > i; --j) {
                if (a[j] < a[i] && d2[i] < d2[j] + 1) d2[i] = d2[j] + 1;
            }
            int temp = d1[i] + d2[i] - 1;
            if (ans < temp) ans = temp;
        }
        System.out.println(ans);
    }
}
