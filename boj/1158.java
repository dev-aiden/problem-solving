import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= n; ++i) q.offer(i);
        sb.append("<");
        while(q.size() > 1) {
            for(int i = 0; i < k - 1; ++i) q.offer(q.poll());
            sb.append(q.peek()).append(", ");
            q.poll();
        }
        sb.append(q.peek()).append(">");
        System.out.println(sb);
    }
}
