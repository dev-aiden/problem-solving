import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    static int n;
    static int arr[][] = new int[33][33];
    static int check[][] = new int[33][33];
    static ArrayList<Integer> v = new ArrayList<>();
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; ++i) {
            String temp = br.readLine();
            for(int j = 1; j <= n; ++j) arr[i][j] = temp.charAt(j - 1) - 48;
        }
        int cnt = 0;
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= n; ++j) {
                if(arr[i][j] == 1 && check[i][j] == 0) v.add(dfs(i, j, ++cnt));
            }
        }
        Collections.sort(v);
        sb.append(cnt).append("\n");
        int len = v.size();
        for(int i = 0; i < len; ++i) sb.append(v.get(i)).append("\n");
        System.out.println(sb);
    }

    public static int dfs(int x, int y, int cnt) {
        int ret = 1;
        check[x][y] = cnt;
        for(int i = 0; i < 4; ++i) {
            int nx = x + dx[i], ny = y + dy[i];
            if(nx >= 1 && nx <= n && ny >= 1 && ny <= n && arr[nx][ny] == 1 && check[nx][ny] == 0) {
                ret += dfs(nx, ny, cnt);
            }
        }
        return ret;
    }
}