import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] d = new int[33];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solve(n));
    }

    public static int solve(int n) {
        if (n == 0) return 1;
        if (n % 2 == 1) return 0;
        if (d[n] > 0) return d[n];
        d[n] = solve(n - 2) * 3;
        for (int i = n - 4; i >= 0; i -= 2) d[n] += solve(i) * 2;
        return d[n];
    }
}
