import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 1; i <= n; ++i) {
            if(solve(i)) ++ans;
        }
        System.out.println(ans);
    }

    static boolean solve(int num) {
        String s = String.valueOf(num);
        int len = s.length();
        if(len <= 2) return true;
        int sub = s.charAt(1) - s.charAt(0);
        for(int i = 2; i < len; ++i) {
            if(sub != (s.charAt(i) - s.charAt(i - 1))) {
                return false;
            }
        }
        return true;
    }
}
