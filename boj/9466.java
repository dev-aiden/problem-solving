import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static int arr[] = new int[100003];
    static int check[] = new int[100003];
    static int start[] = new int[100003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t; for(t = Integer.parseInt(br.readLine()); t-- > 0;) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int i = 1; i <= n; ++i) {
                arr[i] = Integer.parseInt(st.nextToken());
                start[i] = check[i] = 0;
            }
            int ans = 0;
            for(int i = 1; i <= n; ++i) {
                if(check[i] == 0) ans += dfs(i, i, 1);
            }
            sb.append(n - ans).append("\n");
        }
        System.out.println(sb);
    }

    public static int dfs(int num, int s, int cnt) {
        if(check[num] != 0) {
            if(start[num] == s) return cnt - check[num];
            return 0;
        }
        check[num] = cnt;
        start[num] = s;
        return dfs(arr[num], s, cnt + 1);
    }
}