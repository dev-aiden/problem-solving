import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder ans = new StringBuilder();
        while (n != 0) {
            int temp = n % b;
            if (temp < 10) ans.append((char)(temp + 48));
            else ans.append((char)(temp + 55));
            n /= b;
        }
        ans.reverse();
        System.out.println(ans);
    }
}
