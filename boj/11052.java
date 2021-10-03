import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] p = new int[1003];
    static int[] d = new int[1003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; ++i) p[i] = Integer.parseInt(st.nextToken());
        System.out.println(solve(n));
    }

    public static int solve(int num) {
        if (num == 1) return p[1];
        if (d[num] != 0) return d[num];
        for (int i = 1; i <= num; ++i) {
            int temp = solve(num - i) + p[i];
            if (d[num] < temp) d[num] = temp;
        }
        return d[num];
    }
}
