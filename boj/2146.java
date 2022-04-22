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

    static int n;
    static int arr[][] = new int[103][103];
    static int group[][] = new int[103][103];
    static int dist[][] = new int[103][103];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int number = 1;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if(arr[i][j] == 1 && group[i][j] == 0) {
                    Queue<Pair> q = new LinkedList<>();
                    q.add(new Pair(i, j));
                    group[i][j] = number;
                    while(!q.isEmpty()) {
                        Pair p = q.remove();
                        for(int k = 0; k < 4; ++k) {
                            int ny = p.y + dy[k];
                            int nx = p.x + dx[k];
                            if(ny >= 0 && ny < n && nx >= 0 && nx < n) {
                                if(arr[ny][nx] == 1 && group[ny][nx] == 0) {
                                    q.add(new Pair(ny, nx));
                                    group[ny][nx] = number;
                                }
                            }
                        }
                    }
                    ++number;
                }
            }
        }
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                dist[i][j] = -1;
                if(arr[i][j] == 1) {
                    dist[i][j] = 0;
                    q.add(new Pair(i, j));
                }
            }
        }
        while(!q.isEmpty()) {
            Pair p = q.remove();
            for(int i = 0; i < 4; ++i) {
                int ny = p.y + dy[i];
                int nx = p.x + dx[i];
                if(ny >= 0 && ny < n && nx >= 0 && nx < n) {
                    if(dist[ny][nx] == -1) {
                        dist[ny][nx] = dist[p.y][p.x] + 1;
                        group[ny][nx] = group[p.y][p.x];
                        q.add(new Pair(ny, nx));
                    }
                }
            }
        }
        int ans = -1;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                for(int k = 0; k < 4; ++k) {
                    int ny = i + dy[k];
                    int nx = j + dx[k];
                    if(ny >= 0 && ny < n && nx >= 0 && nx < n) {
                        if(group[i][j] != group[ny][nx]) {
                            if(ans == -1 || ans > dist[i][j] + dist[ny][nx]) {
                                ans = dist[i][j] + dist[ny][nx];
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}