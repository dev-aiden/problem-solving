import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append((int)Math.pow(2, n) - 1).append("\n");
        solve(n, 1, 3, sb);
        System.out.println(sb);
    }

    public static void solve(int n, int start, int end, StringBuilder sb) {
        if(n == 0) return;
        solve(n - 1, start, 6 - start - end, sb);
        sb.append(start).append(" ").append(end).append("\n");
        solve(n - 1, 6 - start - end, end, sb);
    }
}