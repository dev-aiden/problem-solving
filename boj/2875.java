import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int ans, temp = m * 2;
        if(n % 2 == 1) {
            --n;
            --k;
        }
        if(n > temp) {
            k -= (n - temp);
            ans = m;
        } else {
            k -= ((temp - n) / 2);
            ans = n / 2;
        }
        while(k > 0) {
            k -= 3;
            --ans;
        }
        System.out.println(ans);
    }
}