import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int prime[] = new int[1003];

    public static void main(String[] args) throws IOException {
        prime[1] = 1;
        for(int i = 2; i <= 1000; ++i) {
            for(int j = i * i; j <= 1000; j += i) {
                prime[j] = 1;
            }
        }
        int ans = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; ++i) {
            int num = Integer.parseInt(st.nextToken());
            if(prime[num] == 0) ++ans;
        }
        System.out.println(ans);
    }
}
