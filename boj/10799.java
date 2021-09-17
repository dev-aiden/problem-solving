import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();
        String str = br.readLine();
        int len = str.length();
        int ans = 0;
        for (int i = 0; i < len; ++i) {
            if (str.charAt(i) == '(') {
                s.push(i);
            } else {
                if (s.peek() == (i - 1)) {
                    s.pop();
                    ans += s.size();
                } else {
                    s.pop();
                    ++ans;
                }
            }
        }
        System.out.println(ans);
    }
}
