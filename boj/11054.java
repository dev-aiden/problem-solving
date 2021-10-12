import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int a[] = new int[1003];
    static int d1[] = new int[1003];
    static int d2[] = new int[1003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; ++i) {
            a[i] = Integer.parseInt(st.nextToken());
            solve1(i);
        }
        int ans = 0;
        for (int i = n; i >= 1; --i) {
            solve2(i);
            int temp = d1[i] + d2[i] - 1;
            if (ans < temp) ans = temp;
        }
        System.out.println(ans);
    }

    public static int solve1(int num) {
        if (d1[num] > 0) return d1[num];
        d1[num] = 1;
        for (int i = num - 1; i >= 1; --i) {
            if (a[num] > a[i] && d1[num] < solve1(i) + 1) d1[num] = d1[i] + 1;
        }
        return d1[num];
    }

    public static int solve2(int num) {
        if (d2[num] > 0) return d2[num];
        d2[num] = 1;
        for (int i = num + 1; i <= n; ++i) {
            if (a[num] > a[i] && d2[num] < solve2(i) + 1) d2[num] = d2[i] + 1;
        }
        return d2[num];
    }
}
