import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static Stack<Character> s1 = new Stack<>();
    static Stack<Character> s2 = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int len = s.length();
        for(int i = 0; i < len; ++i) s1.push(s.charAt(i));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.charAt(0) == 'L') {
                if(!s1.empty()) {
                    s2.push(s1.peek());
                    s1.pop();
                }
            } else if(cmd.charAt(0) == 'D') {
                if(!s2.empty()) {
                    s1.push(s2.peek());
                    s2.pop();
                }
            } else if(cmd.charAt(0) == 'B') {
                if(!s1.empty()) {
                    s1.pop();
                }
            } else if(cmd.charAt(0) == 'P') {
                s1.push(st.nextToken().charAt(0));
            }
        }
        while(!s1.empty()) {
            s2.push(s1.peek());
            s1.pop();
        }
        while(!s2.empty()) {
            sb.append(s2.peek());
            s2.pop();
        }
        sb.append("\n");
        System.out.println(sb);
    }
}
