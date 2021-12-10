import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t; for(t = Integer.parseInt(br.readLine()); t-- > 0;) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int len = s.length();
            for(int i = 0; i < len; ++i) {
                for(int j = 0; j < r; ++j) sb.append(s.charAt(i));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
