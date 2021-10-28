import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        if(n == 0) {
            System.out.println(0);
            return;
        }
        while (n != 0) {
            int a = n / (-2), b = n % 2;
            if (b < 0) {
                ++a;
                b = 1;
            }
            n = a;
            ans.append(b);
        }
        ans.reverse();
        System.out.println(ans);
    }
}
