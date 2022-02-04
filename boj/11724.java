import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    
    static ArrayList<Integer>[] arr = new ArrayList[1003];
    static boolean[] check = new boolean[1003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= n; ++i) arr[i] = new ArrayList<>();
        for(int i = 0; i < m; ++i) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[u].add(v); arr[v].add(u);
        }
        int ans = 0;
        for(int i = 1; i <= n; ++i) {
            if(!check[i]) {
                ++ans;
                dfs(i);
            }
        }
        System.out.println(ans);
    }

    public static void dfs(int num) {
        check[num] = true;
        int len = arr[num].size();
        for(int i = 0; i < len; ++i) {
            if(!check[arr[num].get(i)]) dfs(arr[num].get(i));
        }
    }
}
