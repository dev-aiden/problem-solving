import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) solve(i, j, n);
            sb.append("\n");
        }
        sb.append("\n");
        System.out.println(sb);
    }

    public static void solve(int r, int c, int size) {
        if(r / size % 3 == 1 && c / size % 3 == 1) sb.append(" ");
        else if(size / 3 == 0) sb.append("*");
        else solve(r, c, size / 3);
    }
}