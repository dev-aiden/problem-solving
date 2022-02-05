import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] arr = new ArrayList[20003];
    static int[] check = new int[20003];
    static boolean ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k; for(k = Integer.parseInt(br.readLine()); k-- > 0;) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            for(int i = 1; i <= v; ++i) {
                arr[i] = new ArrayList<>();
                check[i] = 0;
            }
            ans = true;
            for(int i = 0; i < e; ++i) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a].add(b); arr[b].add(a);
            }
            for(int i = 1; i <= v; ++i) {
                if(check[i] == 0) dfs(i, 1);
            }
            System.out.println(ans ? "YES" : "NO");
        }
    }

    public static void dfs(int num, int val) {
        check[num] = val;
        int len = arr[num].size();
        for(int i = 0; i < len; ++i) {
            if(check[arr[num].get(i)] == 0) dfs(arr[num].get(i), 3 - val);
            else if(check[arr[num].get(i)] == val) ans = false;
        }
    }
}
