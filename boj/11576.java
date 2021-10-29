import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        int temp = 0;
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; ++i) {
            int num = Integer.parseInt(st.nextToken());
            temp *= a;
            temp += num;
        }
        Vector<Integer> v = new Vector<>();
        while(temp != 0) {
            v.add(temp % b);
            temp /= b;
        }
        Collections.reverse(v);
        int len = v.size();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; ++i) sb.append(v.get(i)).append(" ");
        System.out.println(sb);
    }
}
