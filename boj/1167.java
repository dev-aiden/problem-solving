import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair {
    int node, dist;
    Pair(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

public class Main {

    static List<Pair>[] arr = new ArrayList[100003];
    static int[] dist = new int[100003];
    static int[] check = new int[100003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; ++i) arr[i] = new ArrayList<>();
        StringTokenizer st;
        for(int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            while(true) {
                int v = Integer.parseInt(st.nextToken());
                if(v == -1) break;
                int d = Integer.parseInt(st.nextToken());
                arr[u].add(new Pair(v, d));
            }
        }
        bfs(1);
        int maxNode = -1, maxDist = -1;
        for(int i = 1; i <= n; ++i) {
            if(dist[i] > maxDist) {
                maxDist = dist[i];
                maxNode = i;
            }
            dist[i] = 0;
            check[i] = 0;
        }
        bfs(maxNode);
        maxDist = -1;
        for(int i = 1; i <=n; ++i) {
            if(dist[i] > maxDist) {
                maxDist = dist[i];
            }
        }
        System.out.println(maxDist);
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] = 1;
        while(!q.isEmpty()) {
            int node = q.remove();
            int len = arr[node].size();
            for(int i = 0; i < len; ++i) {
                if(check[arr[node].get(i).node] == 0) {
                    check[arr[node].get(i).node] = 1;
                    q.add(arr[node].get(i).node);
                    dist[arr[node].get(i).node] = dist[node] + arr[node].get(i).dist;
                }
            }
        }
    }
}
