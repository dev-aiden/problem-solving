import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] d = new long[103];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int t = Integer.parseInt(br.readLine()); t-- > 0;) {
            int n = Integer.parseInt(br.readLine());
            sb.append(solve(n)).append("\n");
        }
        System.out.println(sb);
    }

    public static long solve(int n) {
        if (n <= 3) return 1;
        if (n <= 5) return 2;
        if (d[n] > 0) return d[n];
        return d[n] = solve(n - 5) + solve(n - 1);
    }
}
