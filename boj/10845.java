import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int num = 0;
        for(int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push")) {
                num = Integer.parseInt(st.nextToken());
                q.offer(num);
            } else if(cmd.equals("pop")) {
                if(q.isEmpty()) sb.append("-1\n");
                else sb.append(q.poll()).append("\n");
            } else if(cmd.equals("size")) {
                sb.append(q.size()).append("\n");
            } else if(cmd.equals("empty")) {
                sb.append(q.isEmpty() ? 1 : 0).append("\n");
            } else if(cmd.equals("front")) {
                if(q.isEmpty()) sb.append("-1\n");
                else sb.append(q.peek()).append("\n");
            } else if(cmd.equals("back")) {
                if(q.isEmpty()) sb.append("-1\n");
                else sb.append(num).append("\n");
            }
        }
        System.out.println(sb);
    }
}
