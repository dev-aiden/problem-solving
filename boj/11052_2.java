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
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= i; ++j) {
                int temp = d[i - j] + p[j];
                if(d[i] < temp) d[i] = temp;
            }
        }
        System.out.println(d[n]);
    }
}
