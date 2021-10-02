import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] d = new int[13];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        d[1] = 1; d[2] = 2; d[3] = 4;
        for(int i = 4; i < 11; ++i) d[i] = d[i - 3] + d[i - 2] + d[i - 1];
        int t; for(t = Integer.parseInt(br.readLine()); t-- > 0;) {
            int n = Integer.parseInt(br.readLine());
            sb.append(d[n]).append("\n");
        }
        System.out.println(sb);
    }
}
