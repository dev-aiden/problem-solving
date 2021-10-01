import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] d = new int[1003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solve(n));
    }

    public static int solve(int num) {
        if (num < 2) return 1;
        if (d[num] != 0) return d[num];
        return d[num] = (solve(num - 2) * 2 + solve(num - 1)) % 10007;
    }
}
