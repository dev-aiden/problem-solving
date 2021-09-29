import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] d = new int[1000003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 2; i <= n; ++i) {
            d[i] = d[i - 1] + 1;
            if ((i % 2 == 0) && (d[i] > d[i / 2] + 1)) d[i] = d[i / 2] + 1;
            if ((i % 3 == 0) && (d[i] > d[i / 3] + 1)) d[i] = d[i / 3] + 1;
        }
        System.out.println(d[n]);
    }
}
