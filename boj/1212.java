import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < len; ++i) {
            int num = s.charAt(i) - 48;
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < 3; ++j) {
                temp.append(num % 2);
                num /= 2;
                if (i == 0 && num == 0) break;
            }
            temp.reverse();
            ans.append(temp);
        }
        System.out.println(ans);
    }
}
