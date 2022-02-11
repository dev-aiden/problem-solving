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
    
    static int n, m;
    static int arr[][] = new int[103][103];
    static int check[][] = new int[103][103];
    static Queue<Pair> q = new LinkedList<Pair>();
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= n; ++i) {
            String s = br.readLine();
            for(int j = 1; j <= m; ++j) arr[i][j] = s.charAt(j - 1) - 48;
        }
        bfs(1, 1);
        System.out.println(check[n][m]);
    }

    public static void bfs(int a, int b) {
        check[a][b] = 1;
        q.add(new Pair(a, b));
        while(!q.isEmpty()) {
            Pair temp = q.poll();
            for(int i = 0; i < 4; ++i) {
                int ny = temp.y + dy[i], nx = temp.x + dx[i];
                if(ny >= 1 && ny <= n && nx >= 1 && nx <= m && arr[ny][nx] == 1 && check[ny][nx] == 0) {
                    check[ny][nx] = check[temp.y][temp.x] + 1;
                    q.add(new Pair(ny, nx));
                }
            }
        }
    }
}