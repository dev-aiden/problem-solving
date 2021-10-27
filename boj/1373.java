import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        StringBuilder ans = new StringBuilder();
        for (int i = len - 1; i >= 0; i -= 3) {
            int temp = 0, num = 1;
            for (int j = 0; j < 3; ++j) {
                if (i - j >= 0) {
                    temp += (s.charAt(i - j) - 48) * num;
                    num *= 2;
                }
            }
            ans.append(temp);
        }
        ans.reverse();
        System.out.println(ans);
    }
}
