import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int t = Integer.parseInt(br.readLine()); t-- > 0;) {
            String s = br.readLine();
            int len = s.length();
            int sum = 0, flag = 1;
            for(int i = 0; i < len; ++i) {
                if(s.charAt(i) == '(') {
                    ++sum;
                } else {
                    --sum;
                    if(sum < 0) {
                        flag = 0;
                        break;
                    }
                }
            }
            if(sum > 0) flag = 0;
            sb.append((flag == 1) ? "YES\n" : "NO\n");
        }
        System.out.println(sb);
    }
}
