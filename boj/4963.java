import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static int w, h;
    static int[][] arr = new int[53][53];
    static int[][] check = new int[53][53];
    static int dx[] = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int dy[] = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w == 0 && h == 0) break;
            for(int i = 1; i <= h; ++i) {
                st = new StringTokenizer(br.readLine());
                for(int j = 1; j <= w; ++j) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    check[i][j] = 0;
                }
            }
            int ans = 0;
            for(int i = 1; i <= h; ++i) {
                for(int j = 1; j <= w; ++j) {
                    if(arr[i][j] == 1 && check[i][j] == 0) {
                        ++ans;
                        dfs(i, j);
                    }
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int y, int x) {
        check[y][x] = 1;
        for(int i = 0; i < 8; ++i) {
            int nx = x + dx[i], ny = y + dy[i];
            if(nx >= 1 && nx <= w && ny >= 1 && ny <= h && arr[ny][nx] == 1 && check[ny][nx] == 0) dfs(ny, nx);
        }
    }
}
