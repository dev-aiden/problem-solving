import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int len = n.length();
        int ans = 0;
        for (int i = 0; i < len; ++i) {
            int num = n.charAt(i) >= 65 ? n.charAt(i) - 55 : n.charAt(i) - 48;
            ans *= b;
            ans += num;
        }
        System.out.println(ans);
    }
}
