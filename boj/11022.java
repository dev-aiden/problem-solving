import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine()), tc = 1;
        for(int i = 0; i < t; ++i) {
            String str = br.readLine();
            int a = str.charAt(0) - 48;
            int b = str.charAt(2) - 48;
            sb.append("Case #").append(tc++).append(": ").append(a).append(" + ").append(b).append(" = ").append(a + b).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}
