import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long twoCount = 0, fiveCount = 0;
        for (long i = 2; i <= n; i *= 2) {
            twoCount += n / i;
        }
        for (long i = 5; i <= n; i *= 5) {
            fiveCount += n / i;
        }
        for (long i = 2; i <= m; i *= 2) {
            twoCount -= m / i;
        }
        for (long i = 5; i <= m; i *= 5) {
            fiveCount -= m / i;
        }
        for (long i = 2; i <= n - m; i *= 2) {
            twoCount -= (n - m) / i;
        }
        for (long i = 5; i <= n - m; i *= 5) {
            fiveCount -= (n - m) / i;
        }
        System.out.println(Math.min(twoCount, fiveCount));
    }
}
