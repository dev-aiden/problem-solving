import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int[] arr = new int[503];
    static ArrayList<Integer> a = new ArrayList<>();

    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        if(n >= m + k - 1 && n <= m * k) {
            for(int i = 0; i < n; ++i) arr[i] = i  + 1;
            int index = 0;
            for(int i = 1; i <= m; ++i) {
                int temp = Math.min(index + k, n - m + i);
                for(int j = temp - 1; j >= index; --j) a.add(arr[j]);
                index = temp;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < n; ++i) sb.append(a.get(i)).append(" ");
            sb.append("\n");
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }
    }
}