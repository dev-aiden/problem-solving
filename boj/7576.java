import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair {
    int y, x;
    Pair(int y, int x) {
        this.y = y;
        this.x = x;
    }
}

public class Main {

    static int m, n;
    static int arr[][] = new int[1003][1003];
    static int dist[][] = new int[1003][1003];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, -1, 0, 1};
    static Queue<Pair> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= n; ++i) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= m; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                dist[i][j] = -1;
                if(arr[i][j] == 1) {
                    q.add(new Pair(i, j));
                    dist[i][j] = 0;
                }
            }
        }
        while(!q.isEmpty()) {
            Pair p = q.remove();
            for(int i = 0; i < 4; ++i) {
                int ny = p.y + dy[i];
                int nx = p.x + dx[i];
                if(1 <= ny && ny <= n && 1 <= nx && nx <= m) {
                    if(arr[ny][nx] == 0 && dist[ny][nx] == -1) {
                        q.add(new Pair(ny, nx));
                        dist[ny][nx] = dist[p.y][p.x] + 1;
                    }
                }
            }
        }
        int ans = 0, flag = 1;
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= m; ++j) {
                if(ans < dist[i][j]) ans = dist[i][j];
                if(arr[i][j] == 0 && dist[i][j] == -1) flag = 0;
            }
        }
        System.out.println((flag == 1) ? ans : -1);
    }
}