import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i) {
            String cmd = br.readLine();
            StringTokenizer st = new StringTokenizer(cmd);
            if(st.nextToken().equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                s.push(num);
            } else if(cmd.equals("pop")) {
                if(s.size() != 0) {
                    sb.append(s.peek()).append("\n");
                    s.pop();
                } else {
                    sb.append("-1").append("\n");
                }
            } else if(cmd.equals("size")) {
                sb.append(s.size()).append("\n");
            } else if(cmd.equals("empty")) {
                sb.append(s.empty() ? 1 : 0).append("\n");
            } else if(cmd.equals("top")) {
                sb.append(s.size() != 0 ? s.peek() : -1).append("\n");
            }
        }
        System.out.println(sb);
    }
}
