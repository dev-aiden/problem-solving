import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static int arr[] = new int[1003];
    static int check[] = new int[1003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t; for(t = Integer.parseInt(br.readLine()); t-- > 0;) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 1; i <= n; ++i) {
                check[i] = 0;
                int num = Integer.parseInt(st.nextToken());
                arr[i] = num;
            }
            int ans = 0;
            for(int i = 1; i <= n; ++i) {
                if(check[i] == 0) {
                    ++ans;
                    dfs(i);
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int num) {
        if(check[num] == 1) return;
        check[num] = 1;
        dfs(arr[num]);
    }
}