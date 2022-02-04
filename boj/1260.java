import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] arr = new ArrayList[1003];
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= n; ++i) arr[i] = new ArrayList<>();
        for(int i = 0; i < m; ++i) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b); arr[b].add(a);
        }
        for(int i = 1; i <= n; ++i) Collections.sort(arr[i]);
        check = new boolean[n + 1];
        dfs(v);
        sb.append("\n");
        check = new boolean[n + 1];
        bfs(v);
        System.out.println(sb);
    }

    public static void dfs(int num) {
        check[num] = true;
        sb.append(num).append(" ");
        int len = arr[num].size();
        for(int i = 0; i < len; ++i) {
            if(!check[arr[num].get(i)]) dfs(arr[num].get(i));
        }
    }

    public static void bfs(int num) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(num);
        check[num] = true;
        while(!q.isEmpty()) {
            int temp = q.remove();
            sb.append(temp).append(" ");
            int len = arr[temp].size();
            for(int i = 0; i < len; ++i) {
                if(!check[arr[temp].get(i)]) {
                    q.add(arr[temp].get(i));
                    check[arr[temp].get(i)] = true;
                }
            }
        }
        sb.append("\n");
    }
}