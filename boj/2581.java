import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int prime[] = new int[10003];

    public static void main(String[] args) throws IOException {
        prime[1] = 1;
        for(int i = 2; i <= 01000; ++i) {
            for(int j = i * i; j <= 10000; j += i) {
                prime[j] = 1;
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(br.readLine());
        int min = -1, sum = 0;
        for(int i = m; i <= n; ++i) {
            if(prime[i] == 0) {
                sum += i;
                if(min == -1) min = i;
            }
        }
        System.out.println((min == -1) ? -1 : sum + "\n" + min);
    }
}
