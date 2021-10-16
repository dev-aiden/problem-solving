import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] d = new int[33];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        d[0] = 1;
        for (int i = 2; i <= n; i += 2) {
            d[i] = d[i - 2] * 3;
            for (int j = i - 4; j >= 0; j -= 2) d[i] += d[j] * 2;
        }
        System.out.println(d[n]);
    }
}
