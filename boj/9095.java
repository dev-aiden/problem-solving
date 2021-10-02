import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] d = new int[13];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t; for(t = Integer.parseInt(br.readLine()); t-- > 0;) {
            int n = Integer.parseInt(br.readLine());
            sb.append(solve(n)).append("\n");
        }
        System.out.println(sb);
    }

    public static int solve(int num) {
        if(num == 1) return 1;
        else if(num == 2) return 2;
        else if(num == 3) return 4;
        if(d[num] > 0) return d[num];
        return d[num] = solve(num - 3) + solve(num - 2) + solve(num - 1);
    }
}
