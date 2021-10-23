import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int arr[] = new int[103];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int t = Integer.parseInt(br.readLine()); t-- > 0;) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            for(int i = 0; i < n; ++i) arr[i] = Integer.parseInt(st.nextToken());
            long ans = 0;
            for(int i = 0; i < n; ++i) {
                for(int j = i + 1; j < n; ++j) {
                    ans += gcd(arr[i], arr[j]);
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
