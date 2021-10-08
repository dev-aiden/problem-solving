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
        for(int i = 1; i <= n; ++i) arr[i] = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; ++i) {
            d[i][0] = max(max(d[i - 1][0], d[i - 1][1]), d[i - 1][2]);
            d[i][1] = d[i - 1][0] + arr[i];
            d[i][2] = d[i - 1][1] + arr[i];
        }
        System.out.println(max(max(d[n][0], d[n][1]), d[n][2]));
    }
}
