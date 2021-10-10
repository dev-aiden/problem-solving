import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Deque<Integer> d = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push_front")) {
                d.offerFirst(Integer.parseInt(st.nextToken()));
            } else if(cmd.equals("push_back")) {
                d.offerLast(Integer.parseInt(st.nextToken()));
            } else if(cmd.equals("pop_front")) {
                if(d.isEmpty()) sb.append("-1\n");
                else sb.append(d.pollFirst()).append("\n");
            } else if(cmd.equals("pop_back")) {
                if(d.isEmpty()) sb.append("-1\n");
                else sb.append(d.pollLast()).append("\n");
            } else if(cmd.equals("size")) {
                sb.append(d.size()).append("\n");
            } else if(cmd.equals("empty")) {
                sb.append(d.isEmpty() ? 1 : 0).append("\n");
            } else if(cmd.equals("front")) {
                if(d.isEmpty()) sb.append("-1\n");
                else sb.append(d.getFirst()).append("\n");
            } else if(cmd.equals("back")) {
                if(d.isEmpty()) sb.append("-1\n");
                else sb.append(d.getLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
