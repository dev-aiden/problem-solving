import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] d = new int[1003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        d[0] = d[1] = 1;
        for(int i = 2; i <= n; ++i) {
            d[i] = d[i - 2] + d[i - 1];
            d[i] %= 10007;
        }
        System.out.println(d[n]);
    }
}
