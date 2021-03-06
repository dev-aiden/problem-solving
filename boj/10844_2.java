import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int d[][] = new int[103][13];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < 10; ++i) d[1][i] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int j = 0; j <= 9; ++j) {
                if (j - 1 >= 0) d[i][j] += d[i - 1][j - 1];
                if (j + 1 <= 9) d[i][j] += d[i - 1][j + 1];
                d[i][j] %= 1000000000;
            }
        }
        int result = 0;
        for (int i = 0; i <= 9; ++i) {
            result += d[n][i];
            result %= 1000000000;
        }
        System.out.println(result);
    }
}
