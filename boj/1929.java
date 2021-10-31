import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int prime[] = new int[1000003];

    public static void main(String[] args) throws IOException {
        prime[1] = 1;
        for(int i = 2; i * i <= 1000000; ++i) {
            for(int j = i * i; j <= 1000000; j += i) {
                prime[j] = 1;
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        for(int i = m; i <= n; ++i) {
            if(prime[i] == 0) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
