import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long d[] = new long[93];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        d[1] = d[2] = 1;
        for(int i = 3; i <= n; ++i) d[i] = d[i - 2] + d[i - 1];
        System.out.println(d[n]);
    }
}
