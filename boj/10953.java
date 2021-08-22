import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; ++i) {
            String str = br.readLine();
            sb.append(str.charAt(0) + str.charAt(2) - 96).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}
