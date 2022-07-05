import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[][] arr = new int[66][66];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i) {
            String s = br.readLine();
            for(int j = 0; j < n; ++j) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        solve(0, 0, n);
        sb.append("\n");
        System.out.println(sb);
    }

    static void solve(int r, int c, int size) {
        int val = arr[r][c], flag = 1;
        for(int i = r; i < r + size; ++i) {
            for(int j = c; j < c + size; ++j) {
                if(arr[r][c] != arr[i][j]) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 0) break;
        }
        if(flag == 1) {
            sb.append(arr[r][c]);
        } else {
            sb.append("(");
            solve(r, c, size / 2);
            solve(r, c + size / 2, size / 2);
            solve(r + size / 2, c, size / 2);
            solve(r + size / 2, c + size / 2, size / 2);
            sb.append(")");
        }
    }
}