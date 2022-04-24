import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static ArrayList<Integer>[] arr = new ArrayList[100003];
    static Queue<Integer> q = new LinkedList<>();
    static int[] parent = new int[100003];
    static int[] check = new int[100003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; ++i) arr[i] = new ArrayList<>();
        StringTokenizer st;
        for(int i = 0; i < n - 1; ++i) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[u].add(v);
            arr[v].add(u);
        }
        q.add(1);
        check[1] = 1;
        while(!q.isEmpty()) {
            int p = q.remove();
            int len = arr[p].size();
            for(int i = 0; i < len; ++i) {
                int num = arr[p].get(i);
                if(check[num] == 0) {
                    q.add(num);
                    parent[num] = p;
                    check[num] = 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 2; i <= n; ++i) {
                sb.append(parent[i]).append("\n");
        }
        System.out.println(sb);
    }
}