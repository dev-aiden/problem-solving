import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int n; for(n = Integer.parseInt(br.readLine()); n-- > 0;) {
            int[] arr = new int[26];
            String s = br.readLine();
            int len = s.length(), flag = 1;
            for(int i = 0; i < len; ++i) {
                if(i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                    if(arr[s.charAt(i) - 97] == 1) {
                        flag = 0;
                        break;
                    } else {
                        arr[s.charAt(i) - 97] = 1;
                        flag = 1;
                    }
                }
            }
            if(flag == 1) ++ans;
        }
        System.out.println(ans);
    }
}
