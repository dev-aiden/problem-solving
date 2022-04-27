import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] arr = new int[13];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; ++i) arr[i] = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = n - 1; i >= 0; --i) {
            ans += (k / arr[i]);
            k %= arr[i];
        }
        System.out.println(ans);
        br.close();
    }
}