import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.max;

public class Main {

    static int d[][] = new int[10003][3];
    static int arr[] = new int[10003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; ++i) {
            for(int j = 0; j < 3; ++j) d[i][j] = -1;
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < 3; ++i) solve(n, i);
        System.out.println(max(max(d[n][0], d[n][1]), d[n][2]));
    }

    public static int solve(int n, int a) {
        if(n == 0) return 0;
        if(d[n][a] != -1) return d[n][a];
        if(a == 0) d[n][a] = max(max(solve(n - 1, 0), solve(n - 1, 1)), solve(n - 1, 2));
        else if(a == 1) d[n][a] = solve(n - 1, 0) + arr[n];
        else if(a == 2) d[n][a] = solve(n - 1, 1) + arr[n];
        return d[n][a];
    }
}
